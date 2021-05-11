package ex02;

public class Cat extends Animal{
	
	public Cat() {
		super("고양이");
	}

	@Override
	public void sound() {
		System.out.println("야옹!");
		
	}
	
}
