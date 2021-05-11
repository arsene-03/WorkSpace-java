package mainLogic;

import java.util.List;

import data.Item;
import data.Member;

public class View {

	public static void menu() { //0. 메인 메뉴 로직
		System.out.println("\n***쇼핑몰 프로그램***");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.print("> ");	
	}



	public static Member signUp() { // 1. 회원 가입
		System.out.println("\n***회원가입***");
		System.out.println("1. 판매자용 계정");
		System.out.println("2. 구매자용 계정");
		System.out.print("> ");
		int selectNum =number();

		if(selectNum==1) { // 1-1. 판매자 회원가입
			System.out.println("I D: ");
			System.out.print("> ");
			String id = Main.scan.nextLine();
			System.out.println("비밀번호: ");
			System.out.print("> ");
			String password = Main.scan.nextLine();
			System.out.println("이름: ");
			System.out.print("> ");
			String name = Main.scan.nextLine();
			System.out.println("전화번호: ");
			System.out.print("> ");
			String phoneNum = Main.scan.nextLine();
			int cash = 0;
			for(int i=0;i<Main.members.size();i++) {
			if((Main.members.get(i).getId()).equals(id)) {
				System.out.println("\n이미 사용하고 있는 ID입니다.");
				return null;
			}else {
				Member seller = new Seller(id, password,name,phoneNum,cash,"판매자");
				return seller;
			}
			}
			
		}else if(selectNum==2) {// 1-2. 구매자 회원가입
			System.out.println("I D: ");
			System.out.print("> ");
			String id = Main.scan.nextLine();
			System.out.println("비밀번호: ");
			System.out.print("> ");
			String password = Main.scan.nextLine();
			System.out.println("이름: ");
			System.out.print("> ");
			String name = Main.scan.nextLine();
			System.out.println("연락처: ");
			System.out.print("> ");
			String phoneNum = Main.scan.nextLine();
			int cash = 0;
			List<Item> basket = null;
			for(int i=0;i<Main.members.size();i++) {
			if((Main.members.get(i).getId()).equals(id)) {
				System.out.println("\n이미 사용하고 있는 ID입니다.");
				return null;
			}else {
				Member buyer = new Buyer(id,password,name,phoneNum,cash,"구매자", basket);
				return buyer;
			}
			}
		}
		return null;
	}
		
	
	
	public static void failSignUp() {// 1-3. 회원가입 실패 메서드
		System.out.println("\n회원가입에 실패했습니다.");
		System.out.println("다시 입력해주세요");
	}



	public static String[] signIn() {//2. 로그인 메서드
		System.out.println("\n***로그인***");
		System.out.println("ID를 입력해주세요.");
		System.out.print("> ");
		String id = Main.scan.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		System.out.print("> ");
		String password = Main.scan.nextLine();

		String[] userIdPassword = new String[] {id,password};
		return userIdPassword;
	}

	public static void loginFail() { //2-1 로그인실패 메서드
		System.out.println("\n로그인에 실패했습니다.");
		System.out.println("ID나 비밀번호를 확인해주세요.\n");		
	}


	public static void loginSuccess() {// 2-2. 로그인 성공 메서드
		
		System.out.println("\n***로그인 성공***");	
	}




	public static boolean offProgram() {// 3. 프로그램 종료
		System.out.println("\n***프로그램을 종료하겠습니까?(y)***");
		System.out.println("다른버튼을 입력하면 뒤로갑니다.");
		System.out.print("> ");
		String off = Main.scan.nextLine();

		
		if(off.equals("y")||off.equals("Y")) {
			System.out.println("\n***시스템을 종료합니다.***");	
			System.exit(0);
			return false;
		}else{
			System.out.println("\n뒤로 돌아갑니다.");
			return true;
	}
}


	public static int number() { // 00. 번호입력 메서드
		try {
			int selectNum = Integer.parseInt(Main.scan.nextLine());		
			return selectNum;
		}catch(NumberFormatException err) {}
		return 0;
	}


	public static void userFault() { // 000. 오류 메시지 메서드
		System.out.println("\n잘못 입력했습니다.");
	}
	
	public static void logout() { // 000. 로그아웃 메서드
		System.out.println("\n로그아웃 합니다.");
		
	}



	




















}





