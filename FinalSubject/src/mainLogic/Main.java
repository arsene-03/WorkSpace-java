package mainLogic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import data.Item;
import data.Member;


public class Main {
	
	public static List<Member>members = new ArrayList<>();
	public static Map<String,Item>items = new HashMap<>();
	public static Scanner scan = new Scanner(System.in);
	public static int idx = -1;
	public static void main(String[] args) {
		new Controller();
	}

}
