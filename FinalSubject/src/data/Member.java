package data;

import mainLogic.task;

public class Member implements task {
	private String id;
	private String password;
	private String name;
	private String phoneNum;
	private int cash;
	private String position;
	
	
	public Member(String id, String password, String name, String phoneNum, int cash, String position) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNum = phoneNum;
		this.cash = cash;
		this.position = position;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public int getCash() {
		return cash;
	}


	public void setCash(int cash) {
		this.cash = cash;
	}
	
	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void work() {
		
	}
	
	
	
}
