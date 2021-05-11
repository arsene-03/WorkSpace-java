package com.green.controller;

import com.green.storage.Storage;
import com.green.view.ViewSeller;

public class ControllerSeller {
	private int session = -1; 

	public ControllerSeller(int idx) {
		this.session = idx;
		init();
	}

	private void init() {
		while(true) {
			int selectSellerMenu = ViewSeller.menu();
			
			switch(selectSellerMenu) {
			case 1://물품 등록
				ViewSeller.registProduct(session);
				break;
			case 2:// 개인 정보 보기
				info();
				break;
			case 3://로그아웃
				if(ViewSeller.logout()) {
					session = -1;
					return;
				}
				break;
			default:
				ViewSeller.error();
			}
		}
		
	}

	private void info() {
		int selectPrivateMenu = ViewSeller.infoPrt(session);
		
		switch(selectPrivateMenu) {
		case 1://비밀번호 변경
			ViewSeller.changePassword(session);
			break;
		case 2:// 올림 물품 조회
			ViewSeller.myProduct(Storage.sellers.get(session).getName());
			break;
		case 3:// 캐시 충전
			ViewSeller.chargingCache(session);
			break;
		case 4:// 캐시 환금
			ViewSeller.refundCache(session);
			break;
		case 5:// 돌아가기
			return;
		default:
			ViewSeller.error();
		}
		
	}
	
}
