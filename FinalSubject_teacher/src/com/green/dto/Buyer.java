package com.green.dto;

import java.util.ArrayList;

public class Buyer {
	private String userId;
	private String userPassword;
	private String userName;
	private int cache;
	private String userPhone;
	private ArrayList<Product> basket = new ArrayList<>();
	
	public Buyer(String userId, String userPassword, String userName, int cache, String userPhone) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.cache = cache;
		this.userPhone = userPhone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getCache() {
		return cache;
	}

	public void setCache(int cache) {
		this.cache = cache;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public ArrayList<Product> getBasket() {
		return basket;
	}

	public void setBasket(ArrayList<Product> basket) {
		this.basket = basket;
	}
	
	public void putBasket(Product product,int amount) {
		product.setAmount(amount);
		this.basket.add(product);
	}

	public void Payment() {
		int total = 0;
		
		for(Product p:basket) {
			total += (p.getAmount()*p.getPrice());
		}
		
		if(cache < total) {
			System.out.println("잔액 부족");
			
			
		}else {
			System.out.println("결제가 되었습니다.");
			cache -= total;
			basket.clear();
		}
	}
	
	public void prt() {
		//개인 정보 출력 내용 작성
			System.out.println("이름 : "+this.userName);
			System.out.println("아이디 : "+this.userId);
			System.out.println("연락처 : "+this.userPhone);
			System.out.println("캐시 정보 : "+this.cache);
		}
	

}
