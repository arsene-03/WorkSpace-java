package com.green.View;


import com.green.dto.Member;
import com.green.main.Main;
import com.green.storage.DB;

public class ViewMain {

	public static int menu() { // 메인메뉴
		System.out.println("\n***게시판을 실행합니다.***");
		System.out.println("원하는 기능을 선택해주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 비회원으로 게시물 조회하기");
		System.out.println("4. 프로그램 종료");
		System.out.print("> ");
		int selectMenu = select();
		return selectMenu;
		
	}
	
	public static void signup() {//1. 회원가입
		System.out.println("***\n회원가입에 필요한 정보를 입력해주세요.****");
		System.out.println("ID : ");
		System.out.print("> ");
		String userId = Main.scan.nextLine();
		userId = idRepetChk(userId);
		if(userId == null) {
			return;
		}
		System.out.println("비밀번호 : ");
		System.out.print("> ");
		String userPw = Main.scan.nextLine();
		System.out.println("이름 : ");
		System.out.print("> ");
		String userName = Main.scan.nextLine();
		
		DB.members.add(new Member(userId,userPw,userName)); 
		System.out.println("\n***회원가입에 성공했습니다.***");
		
		
	}
	
	public static void boardChk() { // 3. 게시물 전체조회
		System.out.println("***게시판 전체 글을 조회합니다.***");
		for(int i = 0;i<DB.boards.size();i++) {
			if(DB.boards.get(i)==null) {
				continue;
			}else {
				System.out.println((i+1)+". "+DB.boards.get(i).getTitle());
			}
			System.out.println("\n게시글의 번호를 입력하세요.");
			System.out.println("(0번을 누르면 이전메뉴로 돌아갑니다.");
			System.out.print("> ");
			int selectBoardList = select();

			DB.boards.get(i).prt();
		}
		
	}
	
	public static void exitProgran() {// 4. 프로그램 종료
		System.out.println("프로그램을 종료하겠습니까? (y/n)");
		System.out.print("> ");
		String exit = Main.scan.nextLine();
		exit =exit.toLowerCase();
		if (exit.equals("y")) {
			System.out.println("\n***프로그램을 종료합니다.***");
			System.out.println("***이용해 주셔서 감사합니다.***");
			System.exit(0);
		}else if(exit.equals("n")){
			System.out.println("\n메인메뉴로 돌아갑니다.");
		}else {
			System.out.println("\n잘못 입력했습니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
		}
		
	}
	

	public static int select() {//00 숫자입력 오류테스트
		try {
			int select = Integer.parseInt(Main.scan.nextLine());
			return select;
		}catch (NumberFormatException err){
			
		}
		return 0;
	}

	public static void userfault() { //00 잘못입력
		System.out.println("\n잘못 입력했습니다.");
		System.out.println("다시 입력해주세요.");
		
	}





	private static String idRepetChk(String userId) {//1-1.중복체크
		for(int i = 0 ;i<DB.members.size();i++) {
			if(userId.equals(DB.members.get(i).getUserid())){
				System.out.println("이미 사용하고 있는 ID입니다.");
				return null;
			}
		}return userId;
	}

	public static String[] signin() {//2.로그인
		System.out.println("로그인에 필요한 정보를 입력해주세요");
		System.out.println("ID : ");
		System.out.print("> ");
		String userId = Main.scan.nextLine();
		System.out.println("비밀번호 : ");
		System.out.print("> ");
		String userPw = Main.scan.nextLine();
		
		String[] userlogininfo = {userId, userPw};
		return userlogininfo;
	}

	public static void succesLogin() {
		System.out.println("로그인에 성공했습니다.");
	}

	public static void failLogin() {
		System.out.println("ID 또는 비밀번호가 틀립니다.");
		
	}

	

}
