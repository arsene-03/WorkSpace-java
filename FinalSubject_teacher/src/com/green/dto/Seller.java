package com.green.dto;

public class Seller {
	private String userId;
	private String userPassword;
	private String name;
	private String phone;
	private int cache;
	
	public Seller(String userId, String userPassword, String name, String phone, int cache) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.name = name;
		this.phone = phone;
		this.cache = cache;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getCache() {
		return cache;
	}

	public void setCache(int cache) {
		this.cache += cache;
	}

	public void prt() {
	//개인 정보 출력 내용 작성
		System.out.println("이름 : "+this.name);
		System.out.println("아이디 : "+this.userId);
		System.out.println("연락처 : "+this.phone);
		System.out.println("캐시 정보 : "+this.cache);
	}

	public void setPlusCache(int cache) {
		this.cache += cache;
	}
	
	public void setMinusCache(int money) {
		this.cache -= money;
	}
	
	
	

}
