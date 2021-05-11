package chapter03_1.Q01_06;

public class Q01_06 {

	public static void main(String[] args) {
		// 1. 가로가 3이고 세로가 6인 사각형의 넓이
		
		int width = 3;
		int height = 6;
		int quaArea = width*height;
		
		System.out.println("1. 사각형의 넓이: "+quaArea);
		System.out.println("--------------");
		
		//2. 위 길이의 삼각형의 넓이
		
		double triArea = quaArea/2.0;
		
		System.out.println("2. 삼각형의 넓이: "+triArea);
		System.out.println("--------------");
		
		//3. 성적이 40, 30, 10 나왓다 평균은
		
		int aScore = 40;
		int bScore = 30;
		int cScore = 10;
		int sumScore = aScore+bScore+cScore;
		double avgScore = sumScore/3.0;
		avgScore = Math.round(avgScore*100)/100.0;
		
		System.out.println("3. 평균은: "+avgScore);
		System.out.println("--------------");
		
		//4. 월급이 100원이다 연봉은? (세금 20프로 제외)
		
		int salary = 100;
		int annualSalary = 100*12;
		double AfterTaxSalary = annualSalary*0.8;
		AfterTaxSalary = Math.round(AfterTaxSalary*100)/100.0;
		
		System.out.println("4. 연봉은: "+AfterTaxSalary+"원");
		System.out.println("--------------");
		
		//5. 286초를 분초로 출력
		
		int time = 286;
		int minute = 286/60;
		int second = 286%60;
		
		System.out.printf("5. : %d분 %d초",minute,second);
		System.out.println();
		System.out.println("--------------");
		
		//6. 결과를 추측해보자
		
		int x=10;
		int y=5;
		//(x>7) && (y<=5)  // => true
		//(x%3==0) || (y%2 !=1) // => false
		//결과를 추측해보자.
		
		System.out.println("6.");
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3==0) || (y%2 !=1));
		System.out.println("--------------");
		
		
		//7. 176840원을 화폐매수대로 출력
		
		int originMoney = 176840;
		int unit=50000;
		int balance = 176840;
		
		int ohMan = balance/unit;
		balance %=unit;
		unit /=5;
		
		int man = balance/unit;
		balance %=unit;
		unit /=2;
		
		int ohCheon = balance/unit;
		balance %=unit;
		unit /=5;
		
		int cheon = balance/unit;
		balance %=unit;
		unit /=2;
		
		int ohBeak = balance/unit;
		balance %=unit;
		unit /=5;
		
		int beak = balance/unit;
		balance %=unit;
		unit /=2;
		
		int ohSip = balance/unit;
		balance %=unit;
		unit /=5;
		
		int sip = balance/unit;
		balance %=unit;
		
		
		System.out.println("원금: "+originMoney);
		System.out.println("   오만원권: "+ohMan+"원");
		System.out.println("   만원권: "+man+"원");		
		System.out.println("   오천원권: "+ohCheon+"원");
		System.out.println("   천원권: "+cheon+"원");
		System.out.println("   오백원권: "+ohBeak+"원");
		System.out.println("   백원권: "+beak+"원");
		System.out.println("   오십권: "+ohSip+"원");
		System.out.println("   십원권: "+sip+"원");
		
		
		
	}

}
