package com.green.q08;

public class Controller {
	public Controller() {
		init();
	}

	private void init() { // 로직 시작

		while(true) {
			int selectNum = View.menu();

			switch(selectNum) {
			case 1: // 회원가입
				Member member = View.sign_up();
				if(member == null) {
					View.userFault();
				}else {
					Main.members.add(member);	
				}
				break;
			case 2: // 로그인
				String[] userinfo = View.sign_in();
				int chk = -1;
				if(Main.members.size()==0) {
					View.loginFail();
				}else {
					
					for(int i =0;i<Main.members.size();i++) {
						if(Main.members.get(i).getId().equals(userinfo[0]) &&
								Main.members.get(i).getPassword().equals(userinfo[1])) {
							View.loginSuccess();
							chk++;
							Main.members.get(i).work();
							Main.members.get(i).test();
						}
					}
				}if(chk==-1) {
					View.loginFail();
				}
				break;



			case 3: // 프로그램 종료
				View.end();
				break;
			default:
				View.userFault();

			}
		}

	}
}
