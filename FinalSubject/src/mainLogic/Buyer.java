package mainLogic;

import java.util.ArrayList;
import java.util.List;

import data.Item;
import data.Member;

public class Buyer extends Member{
	
	private List<Item>basket = new ArrayList<>();

	


	public Buyer(String id, String password, String name, String phoneNum, int cash, String position,
			List<Item> basket) {
		super(id, password, name, phoneNum, cash, position);
		this.basket = basket;
	}




	public List<Item> getBasket() {
		return basket;
	}




	public void setBasket(List<Item> basket) {
		this.basket = basket;
	}




	@Override
	public void work() {
		new buyer.Controller();
	}
	
}
