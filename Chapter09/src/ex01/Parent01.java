package ex01;

public class Parent01 {
	String name;
	
	
	public Parent01(String name) {  //모든 클래스의 조상이 되는 클래스 Object
		this.name = name;
	}

	void method() {
		System.out.println("나는 부모입니다.");
	}
	
	
	private String property;
	
	private void method2() {
		System.out.println("내 재산은 XXX 에 묻어두었다.");
	}
}


