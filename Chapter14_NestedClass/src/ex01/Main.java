package ex01;

public class Main {

	public static void main(String[] args) {
		// 인스턴스를 만들어 봅시다.
		A a = new A();
		
		// 인스턴스 멤버 클래스 B의 인스턴스를 생성해 봅시다.  
		A.B b = a.new B();
	
		// B인스턴스의 멤버들
		b.field1 = 10;
		b.method1();
	
		// 정적 멤버 클래스 C의 인스턴스를 생성 해 봅시다.
		A.C c = new A.C();
		
		// C인스턴스의 멤버들
		c.field1 =10;
		c.method1();
		
		// 정적 멤버 클래스 C 내부의 정적 멤버들
		A.C.field2 = 10;
		A.C.method2();
	
		// 로컬 클래스 D의 인스턴스를 생성해 봅시다.
		// 메서드 내부에 인스턴스 생성과 인스턴스 사용에 대한 내용이 담겨 있으므로
		// 메서드 호출이 곧 로컬 인스턴스 생성
		a.method();
		
	
	}

	
	
	
	
	
}
