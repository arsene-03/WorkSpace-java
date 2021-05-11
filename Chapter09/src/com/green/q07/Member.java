package com.green.q07;
//모델 메세지 전송용
public class Member {
	private String id;
	private String pw;
	private String name;
	private int phoneNum;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Member(String id, String pw, String name, int phoneNum) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	public void prt() {
		System.out.println("이름: "+getName());
		System.out.println("전화번호: "+getPhoneNum());
	}

}
