
public class test {

	public static void main(String[] args) {
		//1. 가로가 3이고 세로가 6인 사각형의 넓이
		int a = 3;  /*a = 가로  b = 세로 */
		int b = 6;
		int result = a*b;
		System.out.println("1. "+result);
		
		//2. 위 길이의 삼각형의 넓이
		System.out.println("2. "+result/2);
		
		//3. 성적이 40 , 30, 10 나왔다 평균은
		int scoreA = 40;
		int scoreB = 30;
		int scoreC = 10;
		
		int sumScore = scoreA + scoreB + scoreC;
		double avgScore = sumScore/3.0;
		System.out.println("3. "+ avgScore);
		
		//4. 월급이 100원이다. 연봉은? (세급20프로제외)
		
		int f = 100;
		
		System.out.println("4. "+(int)(f*12*0.8)+"원");
		
		//5. 286 초를 분초로 출력
		
		int time = 286;
		int min = time/60;
		int sec = time%60;
		
		
		System.out.printf("5. %d분 %d초 \n",min,sec);
		
		
		//7. 176840원을 화폐매수대로 출력
		
		int money = 176840;
		int won50000 = 50000;
		int won10000 = 10000;
		int won1000 = 1000;
		int won500 = 500;
		int won100 = 100;
		int won10 = 10;
		
		System.out.println("7. 5만원권: "+money/won50000+"개");
		System.out.println("   1만원권: "+money%won50000/won10000+"개");
		System.out.println("   1천원권: "+money%won50000%won10000/won1000+"개");
		System.out.println("   5백원권: "+money%won50000%won10000%won1000/won500+"개");
		System.out.println("   1백원권: "+money%won50000%won10000%won1000%won500/won100+"개");
		System.out.println("   1십원권: "+money%won50000%won10000%won1000%won500%won100/won10+"개");
		
		System.out.println();
		
		int money2 = 176840;
		int unit2 = 50000;
		
		int ohMan = money2/unit2;
		money %= unit2;
		unit2 /= 5;
		
		int man = money2/unit2;
		money %= unit2;
		unit2 /= 2;
		
		int ohCheon = money2/unit2;
		money %= unit2;
		unit2 /= 5;
		
		int cheon = money2/unit2;
		money %= unit2;
		unit2 /= 2;
		
		int ohBeak = money2/unit2;
		money %= unit2;
		unit2 /= 5;
		
		int beak = money2/unit2;
		money %= unit2;
		unit2 /= 2;
		
		int ohSip = money2/unit2;
		money %= unit2;
		unit2 /= 5;
		
		int sip = money2/unit2;
		
		System.out.println("오만원권 : "+ohMan);
		System.out.println("만원권 : "+man);
		System.out.println("오천원권 : "+ohCheon);
		System.out.println("천원권 : "+cheon);
		System.out.println("오백원권 : "+ohBeak);
		System.out.println("백원권 : "+beak);
		System.out.println("오십원권 : "+ohSip);
		System.out.println("십원권 : "+sip);
		
		//8. 점수에 따라 등급을 출력해보자
		//    int num = 70;
		//     90이상 A 80이상 B 70이상 C 60이상 D 59이하 F
		int num = 70;
		System.out.print("8. ");
		System.out.println((num>=90) ? "A" : (num>=80) ? "B" : (num>=70) ? "C" : (num>=60) ? "D" : "F");
		
		System.out.println();
		int num2 = 70;
		
		char grade = (num2>=90) ? 'A' : ((num2>=80) ? 'B' : ((num2>=70) ? 'C' : ((num2>=60) ? 'D' : 'F')));
		System.out.println(grade);
		
		// TODO Auto-generated method stub

	}

}
