package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
		try {
			int dan;
			System.out.print("구하려는 구구단의 단을 입력하세요.>");
			dan = Integer.parseInt(scan.nextLine());
			try {
			gugudan(dan);
			run = false;
		}catch (NumberFormatException err2){
			System.out.println("실수는 입력하면 안됩니다.");
			dan = 0;
			}
		}catch(NumberFormatException err1){
			System.out.println("실수는 입력하면 안됩니다.");
			
		}
		int dan = 0;
			
		}
		
		
	}

	private static void gugudan(int dan) throws NumberFormatException {
		System.out.print("어디까지 구할 것인지 입력하세요.>");
		int end = Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<end;i++) {
			System.out.println(dan+" X "+(i+1)+" = "+dan*(i+1)+"\n");	
		}
		
	}

}
