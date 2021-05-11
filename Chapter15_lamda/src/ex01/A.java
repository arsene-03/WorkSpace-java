package ex01;

@FunctionalInterface
public interface A { // 함수형 인터페이스를 만들기 위해서는 반드시 추상 메서드가 하나만 존재
	int add(int a,int b);
//	void method2();
}

// 함수형 인터페이스를 만드는 조건 : 추상메서드 하나
// 함수형 인터페이스를 강제하기 위해 사용되는 어노테이션  @FunctionalInterface
