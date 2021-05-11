package ex03;

public class Main03 {

	public static void main(String[] args) {
		String doc = "맛있는 녀석들";
		
		//삼성 프린터로 출력
		
		//SamsungPrint sp = new SamsungPrint();
		
		Printable sp = new SamsungPrint(); // 인스턴스 생성은 불가하지만 타입으로는 사용 가능
		sp.print(doc);
		
		System.out.println("--------------------------");
		
		// LG프린터로 출력
		
		//LgPrint lp = new LgPrint();
		
		Printable lp = new LgPrint();
		lp.print(doc);
		
		System.out.println("--------------------------");
		
		//Printable pp = new Printable() 클래스가 아니므로 인스턴스 생성 불가능
			
//		xxxx aa = new AA(); //  AA 클래스
//		xxxx의 가능성
//		1. AA 클래스
//		2. AA를 상속하는 부모 클래스
//		3. AA를 상속하는 추상클래서(부모)
//		4. AA를 구현하는 인터페이스
		
	}

}
