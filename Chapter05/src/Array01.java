import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		int[] java;
		
		int[] oracle = new int[20]; // 20칸 짜리 빈 배열을 만들어서 oracle 이라는 이름을 붙인다.
		
		int[] html = new int[] {10,20,30,40}; // 10,20,30,40이 들어간 배열을 만들어서 html 이라는 이름을 붙임
		
		System.out.println("html : "+html);
		System.out.println("html[2] : "+html[2]);
		
		oracle[0] = 100; //데이터 저장
		System.out.println("oracle[0] : "+oracle[0]);
		
		oracle[0] = 200; //데이터 변경
		System.out.println("oracle[0] : "+oracle[0]);
		
		int sum = oracle[0]+50+60; // 데이터 사용(참조)
		
		/////////////////////////////////////////////////////
		
		int num =10;
		
		oracle[num] = 50;
		// oracle[10] = 50;
		System.out.println("oracle[10] : "+oracle[10]);
		
		//////////////////////////////////////////////////////
		System.out.println("**********************");
		
		int[]css =/*new int[] 생략 */ {20,25,40,30};
		
		System.out.println("css[0] : "+css[0]);
		System.out.println("css[1] : "+css[1]);
		System.out.println("css[2] : "+css[2]);
		System.out.println("css[3] : "+css[3]);
		
		System.out.println("**********************");
		//for 반복문으로도 가능
		for(int i =0;i<=3;i++) {  
			System.out.println("css["+i+"] : "+css[i]);
		}
		System.out.println("**********************");
		
		System.out.println("css 배열의 크기: "+css.length);
		System.out.println("oracle 배열의 크기: "+oracle.length);
		
		System.out.println("**********************");
		sum = 0;
		for(int i =0;i<css.length;i++) {  
			System.out.println("css["+i+"] : "+css[i]);
			sum +=css[i];
		}
		System.out.println("합계 : "+sum);
		System.out.println("**********************");
		
		//예제 1. 다음 데이터를 배열에 담아서 합계와 평균을 구해보자 (78.85.72.95.86.90)
		//int[] score = {78,85,72,95,86,90}; 선언과 동시에 배열 데이터를 담을
		int[] score;
		double avg = 0.0;
		score = new int[] {78,85,72,95,86,90};
		// 선언이후에 배열을 담는다면 "new int[]를 생략할 수없음
		sum=0;
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		avg = sum/(double)score.length;
		System.out.println("예제1. 합계: "+sum);
		System.out.println("          평균: "+avg);
		
		System.out.println("**********************");
		
		//응용
		int[] number = new int[] {10,20,30,40}; 
		//number배열을 담을 수있는 변수 => []
		//int[] => 배열에 담을 수 있는 데이터가 int형 데이터
		//모든 데이터 타입[] -> 기본 +참조 타입 모든게 가능
		
		String[] names = new String[] {"홍길동","고길동","김길동","황길동"};
		
		Scanner s= new Scanner(System.in);
		
		s.nextLine();

		Scanner[] scans = new Scanner[] {
			new Scanner(System.in),new Scanner(System.in),new Scanner(System.in)
		};
		
		scans[1].nextLine();
		
		
		
	}

}




