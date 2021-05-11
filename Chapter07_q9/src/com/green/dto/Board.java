package com.green.dto;

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
	
	public void prt() {
		System.out.println("\n***게시물 정보를 불러옵니다***");
		System.out.println("제목 : "+this.title);
		System.out.println("작성자 : "+this.name);
		System.out.println("내용 : "+this.contents);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
