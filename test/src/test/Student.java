package test;

import java.util.Scanner;

public class Student {
	private String id;
	private String pw;
	private String name;
	private int[] scores;
	
	public Student(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void inputScores() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요");
		System.out.print("> ");
		int korScore = Integer.parseInt(scan.nextLine());
		System.out.println("영어점수를 입력해주세요");
		System.out.print("> ");
		int engScore = Integer.parseInt(scan.nextLine());
		System.out.println("수학점수를 입력해주세요");
		System.out.print("> ");
		int mathScore = Integer.parseInt(scan.nextLine());
		
		int scores[] = {korScore,engScore,mathScore}; 
		this.scores = scores; 
		
		
	}
	public  void result() {
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum += this.scores[i];
		}
		double avg = sum/3.0;
		
		System.out.println("학생 ID : "+this.id);
		System.out.println("비밀 번호 : "+this.pw);
		System.out.println("학생 이름 : "+this.name);
		System.out.println("국어점수 : "+this.scores[0]);
		System.out.println("영어점수 : "+this.scores[1]);
		System.out.println("수학점수 : "+this.scores[2]);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		
	}
	
}
