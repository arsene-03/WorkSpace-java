package com.green.controller;

import com.green.view.ViewBuyer;

public class ControllerBuyer {
	public static int session = -1; 

	public ControllerBuyer(int idx){
		this.session = idx;
		init();
	}

	private void init() {
		
		while(true) {
			int selectMenu= ViewBuyer.menu();
			switch(selectMenu) {
			case 1://물품 목록 보기
				ViewBuyer.productList();
				break;
			case 2:// 장바구니 보기
				ViewBuyer.basketList();
				break;
			case 3:// 개인 정보 보기
				info();
				break;
			case 4:// 로그 아웃
				if(ViewBuyer.logout()) {
					session = -1;
					return;
				}
				break;
			default:
				ViewBuyer.userError();
			}
		}
	}

	private void info() {
		int selectPrivateMenu = ViewBuyer.infoPrt(session);
		
		switch(selectPrivateMenu) {
		case 1:// 비밀번호 변경
			break;
		case 2:// 캐시 충전
			break;
		case 3:// 캐시 환금
			break;
		case 4:// 돌아가기
			return;
		default:
			ViewBuyer.userError();
		}
		
		
		
	}
}

