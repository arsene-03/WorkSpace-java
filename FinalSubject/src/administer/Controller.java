package administer;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import data.Member;

public class Controller { //관리자 페이지


	public Controller() {
		init( );
	}

	private void init() {
		boolean run = true;
		while(run) {
			View.mainMenu();
			int selectNum=mainLogic.View.number();
			switch(selectNum) {
			case 1: //고객관리
				View.customerManagement();
				int selectNum2=mainLogic.View.number();
				switch(selectNum2) {
				case 1: // 1-1 전체고객 조회
					View.allCustomerCheck();
					break;
				case 2: // 2-1 특정고객 정보 수정
					View.eachCustomerRevise();
					break;
				default:
					mainLogic.View.userFault();
				}
			case 2: // 물품관리
				View.itemCheck();
				break;
			case 3: // 로그아웃
				mainLogic.View.logout();
				run=false;
				break;
			case 4: // 프로그램 종료
				mainLogic.View.offProgram();
				break;				

			default:
				mainLogic.View.userFault();


			}
		}

	}

}
