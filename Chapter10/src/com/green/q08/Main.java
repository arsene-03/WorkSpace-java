package com.green.q08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in); //입력
	public static List<Member>members = new ArrayList<>(); //학생데이터 저장용 컬렉션
	public static void main(String[] args) {
		new Controller();

	}

}
