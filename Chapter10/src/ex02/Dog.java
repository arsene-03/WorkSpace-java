package ex02;

public class Dog extends Animal {

	public Dog() {
		super("강아지");
	}

	@Override
	public void sound() {
		System.out.println("멍멍!");
		
	}
	
}
