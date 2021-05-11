package mainLogic;


import java.util.ArrayList;
import java.util.List;

import data.Member;

public class Seller extends Member{

	public static List sellList = new ArrayList();
	
	 public List getSellList() {
		return sellList;
	}


	public void setSellList(List sellList) {
		this.sellList = sellList;
	}


	Seller(String id, String password, String name, String phoneNum, int cash, String position
			) {
		super(id, password, name, phoneNum, cash, position);
	}

	
	@Override
	public void work() {
		new seller.Controller();
	
	}
	

}
