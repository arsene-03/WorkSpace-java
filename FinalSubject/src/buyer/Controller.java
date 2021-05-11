package buyer;

import java.util.ArrayList;
import java.util.List;

import data.Item;
import data.Member;
import mainLogic.Buyer;


public class Controller {//구매자 페이지
	
	public static int myIdx =mainLogic.Main.idx;
	public static Member buyer = mainLogic.Main.members.get(myIdx);
	public static Buyer me = (Buyer) buyer;

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
				View.buyerInfo();
				View.chargeCash();
				break;
			case 2://물품조회하기
				View.itemCheck();
				break;
			case 3://내 장바구니관리
				View.basketManager();
				int selectNum2 = mainLogic.View.number();
				switch(selectNum2) {
				case 1://장바구니에 담기
					View.makeBasket();
					break;
				case 2:// 장바구니 비우기
					View.setBasket();
					break;
				case 3:// 물건 구매하기
					View.buyItem();
				case 4://장바구니에 있는 물건 조회하기
					View.chkBasket();
					break;
				}
				
				break;
			case 4://로그아웃
				mainLogic.View.logout();
				mainLogic.Main.idx = -1;
				run=false;
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
