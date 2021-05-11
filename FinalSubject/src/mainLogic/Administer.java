package mainLogic;

import data.Member;

public class Administer extends Member{
		
	
		private String id="admin";
		private String password;
		private String name;
		private String phoneNum;
		private int cash;
		private String position;

		

		
	public Administer(String id, String password, String name, String phoneNum, int cash, String position) {
		super(id, password, name, phoneNum, cash,position);
	}
	
	
	public String getId() {
		return id;
	}


	static Member adm = new Administer("admin","admin","관리자","",0,"관리자");




	@Override
	public void work() {
		new administer.Controller();
	}

}
