package com.green.Controller;

import java.util.ArrayList;

import com.green.View.ViewMain;
import com.green.View.ViewMember;
import com.green.dto.Board;
import com.green.dto.Member;
import com.green.storage.DB;

public class ControllerMember {
	private int session = -1;
	
	public ControllerMember(int idx) {
		this.session = idx;
		init();
	}

	private void init() {
		
		boolean run = true;
	
		while(run) {
			int selectMenu=	ViewMember.membersMenu(session);
			switch(selectMenu) {
			case 1:// 글 목록보기
				ViewMain.boardChk();
				break;
			case 2:// 글쓰기
				Board board = ViewMember.writeBoard();
				DB.boards.add(board);
				DB.members.get(session).getMyBoard().add(board);
				break;
			case 3:// 자기 글 보기
				ViewMember.myBoardChk(session);
				break;
			case 4://로그아웃
				if(ViewMember.logOut()) {
					session = -1;
					return;
				}
				break;
			default:
				ViewMain.userfault();
				
			}
						
		}
		
		
		
		
	}
}
