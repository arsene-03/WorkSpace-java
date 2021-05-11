package com.green.q8;

public class View {

	public static int menu() { // 메인메뉴
		System.out.println("***게시판을 실행합니다.***");
		System.out.println("원하는 기능의 번호를 입력해 주세요.");
		System.out.println("1. 게시글 보기");
		System.out.println("2. 글작성");
		System.out.println("3. 프로그램 종료");
		System.out.print("> ");

		int selectNum = Integer.parseInt(Main.scan.nextLine());
		return selectNum;
	}

	public static Board titleWrite() { // 2. 게시물 작성
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


	public static int boardList() { //1. 게시물 목록 보기
		System.out.println("\n***작성된 글목록 입니다.***");
		for(int i=0;i<Main.boards.length;i++)
			if(Main.boards[i] == null) {
				continue;
			}else {
				System.out.println(i+1+". "+Main.boards[i].getTitle());
			}
		System.out.println("\n게시글의 번호를 입력하세요.");
		System.out.println("(0번을 누르면 이전메뉴로 돌아갑니다.");
		System.out.print("> ");
		int selectNum2 = Integer.parseInt(Main.scan.nextLine());

		return selectNum2;
	}

	public static String[] boardinfo() { // 2~3. 게시물 작성자, 비밀번호 정보
		System.out.println("게시글의 작성자 명을 입력하세요.");
		System.out.print("> ");
		String name = Main.scan.nextLine();
		System.out.println("게시글의 비밀번호를 입력하세요.");
		System.out.print("> ");
		String password = Main.scan.nextLine();

		String[] boardinfo = new String [] {name, password};
		return boardinfo;
	}

	public static void deleteBoard() { //3. 글 삭제
		int selectNum = boardList();
		int idxNum = selectNum-1;
		String[] boardinfo = boardinfo();
		if(Main.boards[idxNum].getName().equals(boardinfo[0])){
			if(Main.boards[idxNum].getPassword().equals(boardinfo[1])) {
				Main.boards[idxNum] = null;
				System.out.println("\n***게시글이 삭제되었습니다.***\n");
			}else {
				System.out.println("\n비밀번호가 다릅니다.");
				System.out.println("메인 메뉴로 돌아갑니다.\n");
			}	
		}else {
			System.out.println("\n작성자명이 다릅니다.");
			System.out.println("메인 메뉴로 돌아갑니다.\n");
		}

	}

	public static void failt() { // 1~5외 숫자 입력했을경우
		System.out.println("\n잘못 입력 했습니다.");
		System.out.println("다시 확인해 주세요.\n");

	}


	public static void reviseboard() {// 4. 글 수정
		int selectNum = boardList();
		int idxNum = selectNum-1;
		String[] boardinfo = View.boardinfo();
		if(Main.boards[idxNum].getName().equals(boardinfo[0])){
			if(Main.boards[idxNum].getPassword().equals(boardinfo[1])) {
				
				boolean run = true;
				while(run) {
					System.out.println("수정할 사항을 선택하세요.");
					System.out.println("1. 게시물 제목");
					System.out.println("2. 작성자명");
					System.out.println("3. 비밀번호");
					System.out.println("4. 게시물 내용");
					System.out.println("5. 이전메뉴로");
					System.out.print("> ");
					int reviseNum = Integer.parseInt(Main.scan.nextLine());
					switch(reviseNum) {
					case 1: 
						System.out.println("1.변경할 제목을 입력해 주세요.");
						System.out.print("> ");
						String title = Main.scan.nextLine();
						Main.boards[idxNum].setTitle(title);
						System.out.println("\n***수정 완료되었습니다.***\n");
						break;
					case 2:
						System.out.println("2.작성자 명을 입력해 주세요.");
						System.out.print("> ");
						String name = Main.scan.nextLine();
						Main.boards[idxNum].setTitle(name);
						System.out.println("\n***수정 완료되었습니다.***\n");
						break;
					case 3:
						System.out.println("3.비밀번호를 입력해 주세요.");
						System.out.print("> ");
						String password = Main.scan.nextLine();
						Main.boards[idxNum].setTitle(password);
						System.out.println("\n***수정 완료되었습니다.***\n");
						
						break;
					case 4:
						System.out.println("4.내용을 작성해 주세요.");
						System.out.print("> ");
						String contents = Main.scan.nextLine();
						Main.boards[idxNum].setTitle(contents);
						System.out.println("\n***수정 완료되었습니다.***\n");
						break;
					case 5:
						return;
					default:
						failt();
					}

				}
			}else {
				System.out.println("\n비밀번호가 다릅니다.");
				System.out.println("메인 메뉴로 돌아갑니다.\n");
			}	
		}else {
			System.out.println("\n작성자명이 다릅니다.");
			System.out.println("메인 메뉴로 돌아갑니다.\n");
		}

	}

	public static void programexit() {
		System.out.println("프로그램을 종료하겠습니까? (y/s)");
		System.out.print("> ");
		String exit = Main.scan.nextLine();
		if(exit.equals("y") || exit.equals("Y")) {
			System.exit(0);
		}else if(exit.equals("n") || exit.equals("N")) {
			System.out.println();
			return;
		}else {
			System.out.println("\n잘못 입력 했습니다.");
			System.out.println("다시 확인해 주세요.\n");
		}
		
		
		
	}

	public static void delOrRevise() {
		System.out.println("1. 수정 \n2. 삭제 \n3. 돌아가기");
		System.out.print("> ");
		int selectNum3 = Integer.parseInt(Main.scan.nextLine());
		switch(selectNum3) {
		case 1: // 게시글 수정
			reviseboard();
			break;
		case 2: // 게시글 삭제
			deleteBoard();
			break;
		case 3:
			return;
		default: 
			failt();
		}
		
		
	}

}
