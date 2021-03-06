package com.green.Controller;

import com.green.View.ViewMain;
import com.green.storage.DB;

public class ControllerMain {

	public ControllerMain( ){
		init();
	}

	private void init() {
		boolean run = true;

		while(run) { // 메인 메뉴
			int selectMenu = ViewMain.menu();
			switch(selectMenu) {
			case 1 : // 회원가입
				ViewMain.signup();
				break;
			case 2 : // 로그인
				String[] loginUser =ViewMain.signin();
				for(int i=0;i<DB.members.size();i++) {
					if(loginUser[0].equals(DB.members.get(i).getUserid())
							&&loginUser[1].equals(DB.members.get(i).getUserPassword()))
					{
						int session = i;
						ViewMain.succesLogin();
						new ControllerMember(session);
					}else {
						ViewMain.failLogin();
						return;
					}
				}
				break;
			case 3 : // 비회원으로 게시물 조회
				ViewMain.boardChk();
				break;
			case 4 : // 프로그램 종료
				ViewMain.exitProgran();
				break;
			default : ViewMain.userfault();
			break;



			}

		}

	}
}
