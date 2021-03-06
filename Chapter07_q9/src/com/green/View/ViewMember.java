package com.green.View;

import com.green.dto.Board;
import com.green.main.Main;
import com.green.storage.DB;
public class ViewMember {


	public static int membersMenu(int session) {
		System.out.println("\n***안녕하세요 "+DB.members.get(session).getUserName()+"님***");
		System.out.println("원하는 기능을 선택해주세요.");
		System.out.println("1. 글 목록보기");
		System.out.println("2. 글 쓰기");
		System.out.println("3. 내 글 보기");
		System.out.println("4. 로그아웃");
		System.out.print("> ");
		int selectMenu = ViewMain.select();
		return selectMenu;
		
	}
	
	public static Board writeBoard() {//2. 글작성
		System.out.println("\n***게시글을 작성합니다.***\n");
		System.out.println("1.제목을 입력해 주세요.");
		System.out.print("> ");
		String title = Main.scan.nextLine();
		System.out.println("2.작성자 명을 입력해 주세요.");
		System.out.print("> ");
		String name = Main.scan.nextLine();
		System.out.println("3.비밀번호를 입력해 주세요.");
		System.out.print("> ");
		String password = Main.scan.nextLine();
		System.out.println("4.내용을 작성해 주세요.");
		System.out.print("> ");
		String contents = Main.scan.nextLine();
		System.out.println("***게시글을 저장했습니다.***\n");
		Board board = new Board (title,name,contents,password);
		return board;
	}
	

	public static boolean logOut() {//4. 로그아웃
		System.out.println("로그아웃을 하시겠습니까?(y/n)");
		System.out.print("> ");
		String logOut = Main.scan.nextLine();
		logOut =logOut.toLowerCase();
		if (logOut.equals("y")) {
			System.out.println("\n***로그아웃 합니다.***");
			
			return false;
		}else if(logOut.equals("n")){
			System.out.println("\n메인메뉴로 돌아갑니다.");
			return true;
		}else {
			System.out.println("\n잘못 입력했습니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
			return true;
		}
		
		
	}


	public static void myBoardChk(int session) {//내글보기
		System.out.println("***내가 쓴 글을 조회합니다.***");
		for(int i = 0;i<DB.members.get(session).getMyBoard().size()) {
			if(DB.members.get(session)==null) {
				continue;
			}else {
				System.out.println((i+1)+". "+DB.members.get(session).getMyBoard().);
			}
			System.out.println("\n게시글의 번호를 입력하세요.");
			System.out.println("(0번을 누르면 이전메뉴로 돌아갑니다.");
			System.out.print("> ");
			int selectBoardList = select();

			DB.boards.get(i).prt();
		}
	}

}
