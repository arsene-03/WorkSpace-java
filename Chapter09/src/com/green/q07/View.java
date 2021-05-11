package com.green.q07;
//프로그램을 사용할 사용자가 보게될 화면
public class View {

	public static int menu() {
		System.out.println("그린사이트에 오신것을 환영합니다.");
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.println("선택>");
		
		int selectNum = Integer.parseInt(Main.scan.nextLine());
		return selectNum;
	}
	
	public static void userfault() {
		System.out.println("잘못 입력 했습니다.");
		System.out.println("다시 확인해 주세요.");
	}

	public static boolean programExit() {
		System.out.println("프로그램을 종료하시겠습니까??(y/n)");
		String endcode = Main.scan.nextLine();
		
		if(endcode.equals("y")||endcode.equals("Y")) {
			return false;
		}else if(endcode.equals("n")||endcode.equals("N")) {
			return true;
		}else {
			userfault();
		}while(true);
	
	
}

	public static Member signUp() {
		System.out.println("회원가입을 합니다.");
		System.out.println("아이디를 입력하세요");
		String id = Main.scan.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = Main.scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = Main.scan.nextLine();
		System.out.println("전화번호를 입력하세요.");
		int phoneNum = Integer.parseInt(Main.scan.nextLine());
		
		Member member = new Member(id,pw,name,phoneNum);
		
		return member;
		
	}

	public static void deadLine() {
		System.out.println("회원가입이 마감되었습니다.");
		System.out.println("나중에 다시 찾아와주세요");
		
		
	}

	public static String[] signIn() {
		String[] account = new String[2];
		
		System.out.println("로그인을 합니다.");
		System.out.println("아이디를 입력하세요");
		account[0] = Main.scan.nextLine();
		
		System.out.println("비밀번호를 입력하세요");
		account[1] = Main.scan.nextLine();
		
		return account;
	}

	public static void success(int i) {
		System.out.println("로그인에 성공했습니다.");
		Main.member[i].prt();
		
	}

	public static void failure() {
		System.out.println("로그인에 실패했습니다.");
		System.out.println("아이디 또는 비밀번호를 다시 확인해 주세요.");
		
	}
}