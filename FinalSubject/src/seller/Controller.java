package seller;

import data.Member;


public class Controller {//판매자 페이지
	
	public static int myIdx =mainLogic.Main.idx;
	public static Member seller = mainLogic.Main.members.get(myIdx);
	
	
	
	
	public Controller() {
		init();
	}

	private void init() {
		boolean run = true;
		while(run) {
			View.menu();
			int selectNum = mainLogic.View.number();
			switch(selectNum) {
			case 1://개인정보 조회 및 수정
				View.sellerInfo();
				View.chargeCash();
				break;
			case 2://물품 조회
				View.itemCheck();
				break;
			case 3://내 물품 관리
				View.itemManage();
				break;
			case 4://로그아웃
				mainLogic.View.logout();
				run = false;
				break;
			case 5://프로그램종료
				mainLogic.View.offProgram();
				break;
			default: 
				mainLogic.View.userFault();

			}



		}
}
}
