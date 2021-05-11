package com.green.view;

import com.green.dto.Buyer;
import com.green.dto.Seller;
import com.green.main.Main;
import com.green.storage.Storage;

public class ViewMain {

	public static int menu(){
		java.lang.System.out.println("*********************************");
		System.out.println("*  그린 쇼핑몰에 오신것을 환영합니다.	");
		System.out.println("*  1. 회원 가입");
		System.out.println("*  2. 로그인	");
		System.out.println("*  3. 프로그램 종료	");
		System.out.println("**********************************");
		System.out.print("선택>");
		
		return Integer.parseInt(Main.scan.nextLine());
	
	}

	public static void userError() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해 주세요.");
	}

	public static void exit() {
		System.out.println("프로그램을 종료하시겠습니까? (Y/N)");
		String selectExit = Main.scan.nextLine();
		if(selectExit.equals("Y") || selectExit.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else if(selectExit.equals("N") || selectExit.equals("n")) {
			System.out.println("프로그램을 종료하지 않습니다.");
		}else {
			userError();
		}
	}

	public static String[] signUp() {
		String[] userInfo = new String[3];
		System.out.println("로그인을 진행합니다.");
		System.out.println("1.판매자 | 2.구매자");
		userInfo[0] = Main.scan.nextLine();
		
		if(userInfo[0].equals("1") ||userInfo[0].equals("2") ||userInfo[0].equals("0")) {
			System.out.println("아이디를 입력하세요.");
			userInfo[1] = Main.scan.nextLine();
			
			System.out.println("비밀번호를 입력하세요.");
			userInfo[2] = Main.scan.nextLine();
			
			return userInfo;
		}else {
			userError();
			return null;
		}
	}

	public static void signIn() {
		System.out.println("회원가입을 진행합니다.");
		System.out.println("1.판매자 | 2.구매자");
		int selectMember = Integer.parseInt(Main.scan.nextLine());

		if(selectMember == 1) {
			signInSeller();
		}else if(selectMember == 2){
			signInBuyer();
		}else {
			userError();
			System.out.println("회원가입을 취소합니다.");
			return;
		}
	}

	private static void signInBuyer() {
		System.out.println("구매자 회원가입을 진행합니다.");
		System.out.println("아이디를 입력하세요.");
		String userId = Main.scan.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String userPassword = Main.scan.nextLine();
		System.out.println("이름를 입력하세요.");
		String userName = Main.scan.nextLine();
		System.out.println("연락처를 입력하세요.");
		String userPhone = Main.scan.nextLine();
		System.out.println("초기 충전 캐시를 입력하세요.");
		int cache = Integer.parseInt(Main.scan.nextLine());
		
		Storage.buyers.add(new Buyer(userId,userPassword,userName,cache,userPhone));
		
		System.out.println("회원 가입이 완료되었습니다.");	
	}

	private static void signInSeller() {
		System.out.println("판매자 회원가입을 진행합니다.");
		System.out.println("아이디를 입력하세요.");
		String userId = Main.scan.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String userPassword = Main.scan.nextLine();
		System.out.println("이름를 입력하세요.");
		String userName = Main.scan.nextLine();
		System.out.println("연락처를 입력하세요.");
		String userPhone = Main.scan.nextLine();
		System.out.println("초기 충전 캐시를 입력하세요.");
		int cache = Integer.parseInt(Main.scan.nextLine());
		
		Storage.sellers.add(new Seller(userId,userPassword,userName,userPhone,cache));
		
		System.out.println("회원 가입이 완료되었습니다.");
	}
}
