package com.green.q8;

public class Controller {
	
	public Controller() {
		init();
	}

	private void init() {
		//메인 로직 시작
		
		boolean run = true;
		main:while(run) {
			int selectNum = View.menu();
			
			switch(selectNum) {
			case 1:	// 게시글보기
				
				int selectNum2 = View.boardList(); 
				
				int idxNum = selectNum2-1;
				if(idxNum == -1) {
					break main;
				}else {
				Main.boards[idxNum].prt();
				View.delOrRevise();
				}
			
				break;
			case 2: // 글 작성
				Board board = View.titleWrite();
				
				for (int i=0;i<Main.boards.length;i++)
					if(Main.boards[i] == null) {
						Main.boards[i] = board;
					break;
					}
				break;
			
			case 3: // 프로그램 종료 
				View.programexit();
				
				break;
			default:
				View.failt();
				
			}
			
		}
				
		
		
	}

}
