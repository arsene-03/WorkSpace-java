package ex01;

public class Main {

	public static void main(String[] args) {
		 //익명 구현 객체
		A a1 = new A() {  
			@Override
			public int add(int a, int b) {
				System.out.println(a+b);
				return a+b;
			}
		};
		a1.add(3, 5);

		// 람다  => 메서드가 "하나"인 인터페이스의 객체를 만드는 내용
		A a2 = (a,b)->{System.out.println(a+b); 
							   return a+b;
							  };
		
		a2.add(3, 5);
		
		// 메서드  4가지 종류
		//  입력,     출력
		//   X        X
		//   O        X
		//   X        O
		//   O        O
		
		//  매개변수   return
		
		
	}

}
