package ex02;

public class Main {

	public static void main(String[] args) {
		Member m = new Member() {
					//Member클래스가 아니다.
					//  {}영역은 Member클래스를 상속받은 자식 클래스의 영역
					// 클래스의 영역이므로 멤버 생성 가능
					int age = 10;
					
					void method2() {
						
					}
					// 상속받은 자식 클래스는 이름???   => 익명 자식 클래스
					// 익명 자식 클래스의 특징  => 이름이 없다.  => 언제든지 인스턴스 생성 불가
					//                                =>    1회용
					
					// 익명 자식 클래스를 사용하는 이유??
					
					// 해당 인스턴스를 사용하는 개발자가 직접 인스턴스를 만들어서 사용하기 위함
					
					// 어디서 사용하는가??
					
					// 변수가 선언된 곳 어디서든 사용가능
					
					
					
				};

				
		 m.method();
		 
		 
		 // 예시
		 method(new Member() {

			@Override
			void method() {
				// 개발자 입맛에 맛게 고쳐진 메서드
				System.out.println("고쳐진 메서드");
			}
			 
		 });
		 
	}

	
	
	
	private static void method(Member m) {
		m.method();
		
	}

}
