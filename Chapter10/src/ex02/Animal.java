package ex02;

public abstract class Animal { // 추상클래스
	protected String kind;

	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void breathe() {
		System.out.println("숨쉬기");
	}
	
	public abstract void sound();
}
