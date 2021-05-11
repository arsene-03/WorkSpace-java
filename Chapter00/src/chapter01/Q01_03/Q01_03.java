package chapter01.Q01_03;

public class Q01_03 {

	public static void main(String[] args) {
		//1. 자기소개를 하는 프로그램을 만들어 보자
		System.out.println("1.");
		System.out.println("이름: 최학준");
		System.out.println("나이: 28세");
		System.out.println("연락처: 010-8806-2947");
		System.out.println("------------------------");
		
		//////////////////////////////////////////////////////////
		
		//2. 위 프로그램에 날짜와 버전을 기록해 보자
		String version = "1.8.0_281";
		String date = "04/14";

		//////////////////////////////////////////////////////////
		
		//3. 다음과 같이 출력하는 프로그램을 작성해보자

		int korScore = 75;
		int engScore = 85;
		int mathScore = 90;
		int sumScore = korScore+engScore+mathScore;
		double avgScore = sumScore/3.0;
		avgScore = Math.round(avgScore*100)/100.0;
		String decided = "합격";
		
		System.out.printf("3.\n국어점수: %d점,\n영어점수: %d,\n수학점수: %d,\n총점: %d,\n평균: %f,\n합격여부: %s",
				korScore,engScore,mathScore,sumScore,avgScore,decided);
	}

}
