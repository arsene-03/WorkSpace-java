package com.green.q07;
//메인 기능이 모여 있는 곳
public class Controller {
	
	public Controller() {
		init();
	}
	
	private void init(){
		//메인 로직의 시작 점
		boolean run = true;
		
		while(run) {
			int selectNum = View.menu();
			
			switch(selectNum) {
			case 1://회원가입
				Member member = View.signUp();
				
				int chk = -1;
				
				for(int i=0;i<Main.member.length;i++)
					if(Main.member[i] ==null) {
						Main.member[i]=member;
						chk = i;
						break;
					}
				if(chk == -1) {
					View.deadLine();
				}
					break;
			case 2://로그인
				String[] account = View.signIn();
				int idx = -1;
				for(int i=0;i<Main.member.length;i++) {
					if(Main.member[i] == null) {
						continue;
					}else if(Main.member[i].getId().equals(account[0])&&
							(Main.member[i].getpw().equals(account[1]))) {
						idx = i;
						Main.session=-i;
						View.success(i);
					}
				}if (idx ==-1) {
					View.failure();
				}
				
				
				break;
			case 3://프로그램종료
				run = View.programExit();
				break;
			default:
				View.userfault();
			}
			
			
			
		}
	}

}
