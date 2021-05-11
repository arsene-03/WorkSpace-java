
public class test02 {

	public static void main(String[] args) {
		
		int widht = 3;
		int height =6;
		int quaArea = widht*height;
		int triArea = quaArea/2;
				
		System.out.printf("1. 사격형의 넓이는 %d, 2. 삼각형의 넓이는 %d",quaArea,triArea);
		
		System.out.println();
		System.out.println();
		
		//
		
		int aScore = 40;
		int bScore = 30;
		int cScore = 10;
		int sumScore = aScore+bScore+cScore;
		double avgScore = sumScore/3.0;
		
		System.out.println("3. 평균은 "+avgScore);
		
		//
		
		System.out.println();
		
		//
		
		int salary = 100;
		int beforeTax = salary*12;
		double afterTax = beforeTax*0.8;
		
		System.out.println("4. 세후 연봉은: "+afterTax);
		System.out.println();
		
		//
		
		int time = 286;
		int minute = time/60;
		int second = time%60;
		
		System.out.printf("5. %d분 %d초",minute,second);
		System.out.println();
		System.out.println();
		//
		
		int x = 10;
		int y = 5;
		System.out.println("6. ");
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3==0) || (y%2 !=1));
		
		//
		System.out.println();
		//
		
		int oriMoney = 176840;
		int money = 176840;
		int unit = 50000;
		
		int ohMan = money/unit;
		
		money %= unit;
		unit /= 5; // 5만원 나누기 5 = 만원권
		
		int man = money/unit;
		
		money %= unit;
		unit /= 2; // 만원 나누기 2 = 오천원권
		
		int ohCheon = money/unit;
		
		money %= unit;
		unit  /= 5; // 오천원 나누기 5 = 천원권
		
		int cheon = money/unit;
		
		money %= unit;
		unit /= 2; // 천원 나누기 2 = 오백원
		
		int ohBeak = money/unit;
		
		money %= unit;
		unit  /= 5; // 오백원 나누기 5 = 백원
		
		int beak = money/unit;
		
		money %= unit;
		unit /= 2; // 백원 나누기 2 = 오십원
		
		int ohSip = money/unit;
		
		money %= unit;
		unit  /= 5; // 오십원 나누기 5 = 십원
		
		int sip = money/unit;
		
		System.out.println("7. 금액 : "+oriMoney+"원");
		System.out.println("   오만원권: "+ohMan+"원");
		System.out.println("   만원권: "+man+"원");		
		System.out.println("   오천원권: "+ohCheon+"원");
		System.out.println("   천원권: "+cheon+"원");
		System.out.println("   오백원권: "+ohBeak+"원");
		System.out.println("   백원권: "+beak+"원");
		System.out.println("   오십권: "+ohSip+"원");
		System.out.println("   십원권: "+sip+"원");
		
		System.out.println();
		
		//
		
		int num = 70;
		char grade = (num>=90) ? 'A' : (num>=80) ? 'B' : (num>=70) ? 'C' : (num>=60) ? 'D' : 'E';
		System.out.println("8. "+grade);
		

	
		
				
				
		// TODO Auto-generated method stub

	}

}
