package com.green.q2;

import java.util.Iterator;
import java.util.Set;

public class Controller {
	public Controller() {
		init();
	}

	private void init() {

		while(true) { //메인 로직

			try { // 에러 검출
				int selectNum = View.main();

				switch(selectNum) {
				case 1: //단어 입력하기
					View.input();
					break;
				case 2: //단어삭제
					View.delete();
					break;
				case 3: // 전체 단어 조회하기
					View.inquiry();
					break;
				case 4:
					System.exit(0);
					break;
				}
			}catch(NumberFormatException err){
				View.userErr();
			}

		}









	}

}

