
package test;

import java.util.Scanner;

public class Q2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		//조건1. while 문으로 구구단
		
		gugudan1();
		
		
		System.out.println("\n------------조건2-------------\n");

		//조건 2. do while 문으로 입력받은 단만
		
		gugudan2();
		
		
		System.out.println("\n------------조건3-------------\n");

		//조건 3. for문으로 두개의 숫자 입력받기 첫번째: 단 /두번째: 배수
		
		gugudan3();
		
	}

	private static void gugudan3() {
		System.out.println("원하는 단의 숫자를 입력해 주세요");
		System.out.print("> ");
		int dan =Integer.parseInt(scan.nextLine());
		System.out.println("배수를 입력해 주세요");
		System.out.print("> ");
		int multiple =Integer.parseInt(scan.nextLine());
		
		for(int i =dan ;i<=dan;i++) {
			System.out.printf("****%d단****\n",dan);
			for(int j=1;multiple*j<=9;j++) {
				System.out.printf("%d X %d = %d\n",dan,multiple*j,dan*multiple*j);
			}
		}
		
	}

	private static void gugudan2() {
		System.out.println("원하는 단의 숫자를 입력해주세요");
		System.out.print("> ");
		int dan = Integer.parseInt(scan.nextLine());
		
		
			System.out.printf("****%d단****\n",dan);
			int j = 1;
			do {
				System.out.printf("%d X %d = %d\n",dan,j,dan*j);
				j++;
			}while(j<=9);
	}

	private static void gugudan1() {
		int i = 2; //단
		while(i<=9) {
			System.out.printf("****%d단****\n",i);
			int j = 1;
			while(j<=9) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
		}
		
	}

}
