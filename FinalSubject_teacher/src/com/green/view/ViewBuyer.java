package com.green.view;

import java.util.ArrayList;

import com.green.controller.ControllerBuyer;
import com.green.dto.Product;
import com.green.main.Main;
import com.green.storage.Storage;

public class ViewBuyer {

	public static int menu() {
		System.out.println("저희 쇼핑몰에 오신것을 환영합니다.");
		System.out.println("1. 물품 목록 보기");
		System.out.println("2. 장바구니 보기");
		System.out.println("3. 개인 정보 보기");
		System.out.println("4. 로그 아웃");
		int selectNum = Integer.parseInt(Main.scan.nextLine());
		return selectNum;
	}

	public static void userError() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해 주세요.");
		
	}

	public static void productList() {
		System.out.println("저희 쇼핑몰에 등록된 물품 리스트입니다.");
		for(int i=0;i<Storage.products.size();i++) {
			System.out.println((i+1)+"번째 물품 입니다.");
			System.out.println("품목 이름 : "+Storage.products.get(i).getProductName());
			System.out.println("정가 : "+Storage.products.get(i).getPrice());
			System.out.println("재고수량 : "+Storage.products.get(i).getAmount());
			System.out.println("****************************************");
		}
		
		System.out.println("=============================");
		System.out.println("원하시는 상품의 이름을 입력해 주세요.");
		System.out.println("('메뉴'를 입력하시면 메뉴로 돌아갑니다.)");
		
		String selectName = Main.scan.nextLine();
		
		Product product = null;
		
		if(selectName.equals("메뉴")) {
			return;
		}else {
			product = searchProduct(selectName);
		}
		
		if(product == null) {
			return;
		}
		
		putBasket(product);
		
		
	}

	private static void putBasket(Product product) {// 해당 물품을 구매하는 메서드
		System.out.println("구매 수량을 입력하세요.");
		int amount = Integer.parseInt(Main.scan.nextLine());
		
		if(amount > product.getAmount()) {
			System.out.println("재고 수량이 부족합니다.");
			return;
		}
		
		System.out.println("장바구니에 담으시겠습니까?(Y/N)");
		String putBasket = Main.scan.nextLine();
		if(putBasket.equals("Y") ||putBasket.equals("y")) {
			// 장바구니에 담는 내용
/*오류 발생*/	Storage.buyers.get(ControllerBuyer.session).putBasket(product,amount);
			// 장바구니에 담은 만큼 재고 수량을 줄여야 한다.
			searchProduct(product,amount);
			
			System.out.println("장바구니에 담았습니다.");
		}else if(putBasket.equals("N") ||putBasket.equals("n")) {
			System.out.println("장바구니에 담는 것을 취소합니다.");
		}
		
		
	}

	private static void searchProduct(Product product, int amount) {
		for(int i=0;i<Storage.products.size();i++) {
			if(Storage.products.get(i).getProductName().equals(product.getProductName())) {
				Storage.products.get(i).changeAmount(amount);// 재고 수량 감소
			}
		}	
	}

	private static Product searchProduct(String selectName) {
		int idx = -1;
		for(int i=0;i<Storage.products.size();i++) {
			if(Storage.products.get(i).getProductName().equals(selectName)) {
				idx = i;
				return Storage.products.get(i);
			}
		}
		
		if(idx == -1) {
			System.out.println("해당 물품이 없습니다. 다시 확인해 주세요.");
		}
		return null;
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
			userError();
//			return false;
		}
		
		return chk;
	}

	public static int infoPrt(int session) {
		Storage.buyers.get(session).prt();//개인 정보 출력
		System.out.println("1. 비밀번호 변경");
		System.out.println("2. 캐시 충전");
		System.out.println("3. 캐시 환금");
		System.out.println("4. 돌아가기");
		
		return Integer.parseInt(Main.scan.nextLine());
	}

	public static void basketList() {
		System.out.println("장바구니 목록");
		ArrayList<Product> list = Storage.buyers.get(ControllerBuyer.session).getBasket();
		
		for(int i=0;i<list.size();i++) {
			System.out.println("물품 이름 : "+list.get(i).getProductName());
			System.out.println("물품 정가 : "+list.get(i).getPrice());
			System.out.println("물품 수량 : "+list.get(i).getAmount());
		}
		
	}

}
