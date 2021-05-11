package data;

import mainLogic.task;

public class Item implements task{
	private String itemName;
	private int costPrice;
	private int listPrice ;
	private int amount;
	private String sellerId;
	
	
	
	
	public Item(String itemName, int costPrice, int listPrice, int amount, String sellerId) {
		
		this.itemName = itemName;
		this.costPrice = costPrice;
		this.listPrice = listPrice;
		this.amount = amount;
		this.sellerId = sellerId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemname) {
		this.itemName = itemname;
	}
	public int getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}
	public int getListPrice() {
		return listPrice;
	}
	public void setListPrice(int listPrice) {
		this.listPrice = listPrice;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	@Override
	
	public void work() {	
		
	}
}
