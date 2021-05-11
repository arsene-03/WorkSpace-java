package ex01;

public abstract class Car { // 추상메서드를 가지는 추상클래스
	String color;
	int speed;
	
	public abstract void forward(); // 몸체 없는 추상메서드
	
	public abstract void backward();
	
}
