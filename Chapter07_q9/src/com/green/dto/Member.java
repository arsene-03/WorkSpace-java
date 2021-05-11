package com.green.dto;

import java.util.ArrayList;

public class Member {
	
	private String userid;
	private String userPassword;
	private String userName;
	private ArrayList<Board> myBoard = new ArrayList<>();
	
	
	public Member(String userid, String userPassword, String userName) {
		this.userid = userid;
		this.userPassword = userPassword;
		this.userName = userName;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
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


	public ArrayList<Board> getMyBoard() {
		return myBoard;
	}


	public void setMyBoard(ArrayList<Board> myBoard) {
		this.myBoard = myBoard;
	}
	
	
	
	
	
	
	
}
