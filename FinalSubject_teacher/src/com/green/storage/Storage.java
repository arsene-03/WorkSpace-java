package com.green.storage;

import java.util.ArrayList;
import java.util.List;

import com.green.dto.Admin;
import com.green.dto.Buyer;
import com.green.dto.Product;
import com.green.dto.Seller;

public class Storage {

	public static Admin admin = Admin.getInstance();
	public static List<Product> products = new ArrayList<>();
	public static List<Seller> sellers = new ArrayList<>();
	public static List<Buyer> buyers = new ArrayList<>();
	
}
