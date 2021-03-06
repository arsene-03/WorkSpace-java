package com.green.controller;

import java.util.function.Consumer;

import com.green.dto.Buyer;
import com.green.dto.Seller;
import com.green.storage.Storage;
import com.green.view.ViewMain;

public class ControllerMain {
	public ControllerMain() {
		init();
	}

	private void init(){
		while(true) {
			int selectMenuNumber = ViewMain.menu();
			
			switch(selectMenuNumber) {
			case 1://회원 가입
				ViewMain.signIn();
				break;
			case 2:// 로그인
				String[] userInfo = ViewMain.signUp();
				
				switch(userInfo[0]) {
				case "0":
					//관리자 로그인
					if(userInfo[1].equals(Storage.admin.getAdminId()) 
							&& userInfo[2].equals(Storage.admin.getAdminPassword())) {
						new ControllerAdmin();
					}
					break;
				case "1":
					//판매자 로그인
					sellerLogin(userInfo);
					break;
				case "2":
					//구매자 로그인
					buyerLogin(userInfo);
					break;
				}
				
				
				break;
			case 3:// 프로그램 종료
				ViewMain.exit();
				break;
			default :
				ViewMain.userError();
			}

		}
		
	}

	private void buyerLogin(String[] userInfo) {
		for(int i=0;i<Storage.buyers.size();i++) {
			if(userInfo[1].equals(Storage.buyers.get(i).getUserId()) 
					&& userInfo[2].equals(Storage.buyers.get(i).getUserPassword())) {
				new ControllerBuyer(i);
				break;
			}
		}
		
	}

	private void sellerLogin(String[] userInfo) {
		for(int i=0;i<Storage.sellers.size();i++) {
			if(userInfo[1].equals(Storage.sellers.get(i).getUserId()) 
					&& userInfo[2].equals(Storage.sellers.get(i).getUserPassword())) {
				new ControllerSeller(i);
				break;
			}
		}
		
	}
}
