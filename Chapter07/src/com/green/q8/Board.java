package com.green.q8;

public class Board {
	private String title;
	private String name;
	private String contents;
	private String password;
	
	
	public Board(String title, String name, String contents, String password) {
		
		this.title = title;
		this.name = name;
		this.contents = contents;
		this.password = password;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getName() {
		return name;
	}


	public String getPassword() {
		return password;
	}
	
	public void prt() {
		System.out.println("\n***게시글을 불러옵니다.***");
		System.out.println("제  목: "+this.title);
		System.out.println("작성자: "+this.name);
		System.out.println("내  용: "+this.contents+"\n");
		
	}
}
