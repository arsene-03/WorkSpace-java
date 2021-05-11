package mainLogic;

import data.Member;

public class Controller {

	public Controller() {
		init();
	}

	private void init() { // 쇼핑몰 공통
		administer();
		boolean run = true;
		while(run) {
			
			View.menu();
			int selectNum = View.number();
			switch(selectNum) {
			case 1:  //회원가입
				Member member = View.signUp();
				if(member == null) {
					View.failSignUp();
				} else {
					Main.members.add(member);	
				}
				break;
			case 2:  //로그인
				String[] userIdPassword = View.signIn();
				String collectId = userIdPassword[0];
				String collectPw = userIdPassword[1];
				for(int i=0;i<Main.members.size();i++) {
					if(Main.members.get(i) == null){
						View.loginFail();
					}else if((Main.members.get(i).getId()).equals(collectId) && (Main.members.get(i).getPassword()).equals(collectPw)) {
						View.loginSuccess();
						Member me= Main.members.get(i);
						Main.idx = i;						
						me.work();
						
					}
				}
				
				break;
			case 3: //프로그램 종료
				run= View.offProgram();
				break;
			default: 
				View.userFault();
			}
		}

	}


	private void administer() { // 관리자 계정 생성
		Main.members.add(Administer.adm);
	}

}
