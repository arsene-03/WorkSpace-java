package com.green.dto;

public class Admin {
	private static Admin admin = new Admin();
	
	public static Admin getInstance() {
		if(admin == null) {
			admin = new Admin();
		}
		return admin;
	}
	
	private Admin() {
		this.adminId = "admin";
		this.adminPassword = "1234";
		this.adminName = "관리자";
		this.adminPhone = "010-1234-5678";
		
	}
	/////////////////////////////////////////////////////////////////
		
	private String adminId;
	private String adminPassword;
	private String adminName;
	private String adminPhone;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
}
