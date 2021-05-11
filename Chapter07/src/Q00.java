import java.util.Scanner;

public class Q00 {
	
	 static Scanner s = new Scanner(System.in);
			 
	public static void main(String[] args) {
		// 5명의 학생 정보를 입력하는 프로그램을 작성해봅시다.
//		Student2 라는 클래스를 만들어서
//		이름, 자바점수, 오라클점수, 파이썬 점수를 저장할 수 있도록합니다.
//		5명의 학생정보를 출력하는 프로그램을 만들어봅시다.
//		5명의 학생정보를 [배열]에 담아서 반복을 통해서 데이터를 입력하고 출력해 봅시다.
		Student2[] students = new Student2[5];
		//입력
		
		for(int i=0;i<5;i++) {
		System.out.println("학생 이름을 입력하세요");
		System.out.print("> ");
		String name = s.nextLine();
		System.out.println("자바 점수를 입력하세요");
		System.out.print("> ");
		int javaScore = Integer.parseInt(s.nextLine());
		System.out.println("오라클 점수를 입력하세요");
		System.out.print("> ");
		int oracleScore = Integer.parseInt(s.nextLine());
		System.out.println("파이썬 점수를 입력하세요");
		System.out.print("> ");
		int pythonScore = Integer.parseInt(s.nextLine());
		
		students[i] = new Student2(name, javaScore, oracleScore, pythonScore);
		}
		//출력
		for(int i=0;i<students.length;i++) {
			students[i].prt();
		}
				
	}

}
