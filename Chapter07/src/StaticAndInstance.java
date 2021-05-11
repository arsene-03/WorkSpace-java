
public class StaticAndInstance {
	// 인스턴스멤버와 클래스 멤버간의 사용 가능성
	
	//정적 멤버
	static int field1;
	static void method1() {
		System.out.println("클래스 메서드");
	}
	//인스턴스 멤버
		int field2;
		void method2() {
			System.out.println("인스턴스 메서드");
	}
		
/////////////////////////////////////////////////
		//위 멤버를 사용하기 위한 정적 메서드
		static void method3() {
			field1 = 10;
			//field2 = 10; 에러 
			method1();
			//methpd2(); 에러
		}
		//위 멤버를 사용하기 위한 인스턴스 메서드
		void method4() {
			field1 = 10;
			field2 = 10;
			method1();
			//methpd2(); 에러
		}
		
}
