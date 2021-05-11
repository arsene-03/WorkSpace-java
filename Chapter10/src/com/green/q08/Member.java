package com.green.q08;

public class Member implements task {

	private String name;
	private String id;
	private String password;
	private String position;
	
	
	public Member(String name, String id, String password, String position) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	@Override
	public void work() {
		
		
	}

	@Override
	public void test() {
		
		
	}

}
