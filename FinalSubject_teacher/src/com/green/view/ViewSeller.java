package com.green.view;

import com.green.dto.Product;
import com.green.main.Main;
import com.green.storage.Storage;

public class ViewSeller {

	public static int menu() {
		System.out.println("판매자 페이지 입니다. 메뉴를 선택해 주세요.");
		System.out.println("1. 물품 등록");
		System.out.println("2. 개인 정보 보기 ");
		System.out.println("3. 로그아웃 ");
		
		return Integer.parseInt(Main.scan.nextLine());
	}

	public static boolean logout() {
		boolean chk = false;
		System.out.println("로그아웃하시겠습니까? (Y/N)");
		String selectLogout = Main.scan.nextLine();
		
		if(selectLogout.equals("Y") ||selectLogout.equals("y")) {
//			return true;
			chk = true;
		}else if(selectLogout.equals("N") ||selectLogout.equals("n")){
//			return false;
			chk = false;
		}else {
			error();
//			return false;
		}
		
		return chk;
	}

	public static void error() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해 주세요.");
	}

	public static int infoPrt(int session) {
		Storage.sellers.get(session).prt();
		System.out.println("1. 비밀번호 변경");
		System.out.println("2. 올린 물품 조회");
		System.out.println("3. 캐시 충전");
		System.out.println("4. 캐시 환금");
		System.out.println("5. 돌아가기");
		
		return Integer.parseInt(Main.scan.nextLine());
	}

	public static void myProduct(String name) {
		for(Product p: Storage.products) {
			if(p.getSellerName().equals(name)) {
				p.sellerPrt();
			}
		}
		
	}


	public static void changePassword(int session) {
		System.out.println("비밀번호를 바꿉니다.");
		System.out.println("바꿀 비밀번호를 입력하세요.");
		String password = Main.scan.nextLine();
		System.out.println("입력한 비밀번호를 확인하세요.");
		String chkPassword = Main.scan.nextLine();

		if(password.equals(chkPassword)) {
			Storage.sellers.get(session).setUserPassword(password);
			System.out.println("비밀번호를 변경했습니다.");
		}else {
			System.out.println("입력한 비밀번호와 확인 비밀번호가 일치하지 않습니다.");
		}
	}

	public static int chargingCache(int session) {
		System.out.println("캐시를 충전합니다.");
		System.out.println("충전하고자 하는 금액을 입력하세요.");
		int cache = Integer.parseInt(Main.scan.nextLine());
		
		Storage.sellers.get(session).setCache(cache);
		
		System.out.println(cache+"원 충전이 완료되었습니다.");

		return cache;
	}

	public static void refundCache(int session) {
		System.out.println("캐시를 환금합니다.");
		System.out.println("환금하고자 하는 금액을 입력하세요.");
		
		int money = Integer.parseInt(Main.scan.nextLine());
		
		if(Storage.sellers.get(session).getCache() < money) {
			System.out.println("캐시가 부족합니다.");
		}else {
			Storage.sellers.get(session).setCache(-money);
			System.out.println(money+"원 환금이 완료되었습니다.");
		}
	}

	public static void registProduct(int session) {
		System.out.println("물품 등록을 시작합니다.");
		System.out.println("물품 이름을 작성하세요.");
		String productName = Main.scan.nextLine();
		System.out.println("물품 원가를 입력하세요.");
		int cost = Integer.parseInt(Main.scan.nextLine());
		System.out.println("물품 수량을 입력하세요.");
		int amount = Integer.parseInt(Main.scan.nextLine());
		
		if((cost*amount) > Storage.sellers.get(session).getCache()) {
			System.out.println("캐시가 부족합니다. 충전하시겠습니까? (Y/N)");
			String selectChargingCache = Main.scan.nextLine();
			
			if(selectChargingCache.equals("Y") || selectChargingCache.equals("y")) {
				int money = ((cost*amount)-Storage.sellers.get(session).getCache());
				System.out.println("최소 "+money+"원 이상 충전해야 합니다.");
				int chargincache = chargingCache(session);
				
				if(chargincache < money) {
					System.out.println("캐시가 부족합니다");
					System.out.println("물품 등록을 취소합니다");
					return;
				}
				
			}else if(selectChargingCache.equals("N") || selectChargingCache.equals("n")) {
				System.out.println("캐시가 부족합니다");
				System.out.println("물품 등록을 취소합니다");
				return;
			}else {
				error();
				System.out.println("물품 등록을 취소합니다");
				return;
			}
		}
		Storage.sellers.get(session).setCache(-(cost*amount));
		
		System.out.println("물품 정가을 입력하세요.");
		int price = Integer.parseInt(Main.scan.nextLine());
		
		Storage.products.add(new Product(productName,cost,price,amount,Storage.sellers.get(session).getName()));
		
	}




}
