package ex01;

public class A {  //네스티드 클래스를 포함하는 외부클래스 A
	
	public A() {//생성자
		System.out.println("A 인스턴스 생성됨");
	}
	// 멤버 클래스 B
	class B{
		public B() {// 멤버 클래스의 생성자
			System.out.println("B 인스턴스 생성됨");
		}
		// 멤버 클래스B 의 멤버
		int field1;
		void method1() {}
		
		// 멤버 클래스 B는 A인스턴스가 있어야 사용가능
		//            static멤버는 A인스턴스가 없어도 사용이 가능해야 하므로
		//			  멤버 클래스 B 내부에 static멤버 사용 불가능
//		static int field2;
//		static void method2() {}
	}
	
	// 정적 멤버 클래스 C
	static class C{
		public C() { //정적 멤버 클래스의 생성자
			System.out.println("C 인스턴스 생성");
		}
		int field1;
		void method1() {}
		
		// static 멤버 클래스 C는 A인스턴스가 없어도 사용 가능
		//        static 멤버 클래스 C 내부의 static 멤버는 사용 가능
		static int field2;
		static void method2() {}
	}
	
	// 로컬 클래스 D
	void method() {//외부 클래스 A의 멤버 메서드
		class D{
			public D() {//로컬 클래스 D의 생성자
				System.out.println("D 인스턴스 생성");
			}
			int field1;
			void method1() {}
			
			// 로컬 클래스 D는 A멤버 메서드가 동작해야만 사용가능한 클래스
			//       A멤버 메서드는 A인스턴스가 존재해야만 사용가능
			//       로컬 클래스 D 내부에는 static 멤버가 올수 없다.
			
//			static int field2;
//			static void method2() {}
		}
		
		// 로컬 클래스는 메서드가 동작해야만 인스턴스 생성 가능
		//   => 인스턴스 선언문이 메서드 내부에 존재
		
		D d = new D();
		d.field1 = 30;
		d.method1();
	}
	
//////////////////////////////////////////////////////////////////////////////
	//A클래스(외부클래스)  멤버의 영역
	
	// 1. 외부 클래스의 멤버 필드로 내부 클래스의 인스턴스를 사용할수 있는가?
	B b1 = new B();
	C c1 = new C();
//	D d1 = new D();  
	
	// 2. 외부 클래스의 멤버 메서드 내부에서 내부 클래스의 인스턴스를 사용할수 있는가?
	void method1() {//외부 클래스의 멤버 메서드
		B b2 = new B();
		C c2 = new C();
//		D d2 = new D();
	}
	
	// 3. 외부 클래스의 정적 멤버 필드로 내부 클래스의 인스턴스를 사용할수 있는가?
//	static B b3 = new B();
	static C c3 = new C();
//	static D d3 = new D();
	
	
	// 4. 외부 클래스의 정적 멤버 메서드 내부에서 내부 클래스의 인스턴스를 사용할수 있는가?
	static void method2() {
//		B b4 = new B();
		C c4 = new C();
//		D d4 = new D();
	}
	
	
	
}
