package com.green.dto;

public class Product {
	private String productName;
	private int cost;
	private int price;
	private int amount;
	private String sellerName;
	
	public Product(String productName, int cost, int price, int amount, String sellerName) {
		this.productName = productName;
		this.cost = cost;
		this.price = price;
		this.amount = amount;
		this.sellerName = sellerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount=amount;
	}
	
	public void changeAmount(int amount) {// 입력받은 개수만큼 재고수량 감소
		this.amount-=amount;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public void sellerPrt() {
		System.out.println("물품 이름 : "+this.productName);
		System.out.println("물품  원가 : "+this.cost);
		System.out.println("물품 정가 : "+this.price);
		System.out.println("물품 수량 : "+this.amount);
		System.out.println("판매자 : "+this.sellerName);
	}
	
	public void buyerPrt() {
		System.out.println("물품 이름 : "+this.productName);
		System.out.println("물품 정가 : "+this.price);
		System.out.println("물품 수량 : "+this.amount);
	}

	

}
