package ex02;

public class Car {
	
	String color = "white";
	int speed = 0;
	
	public void forward() {
		speed++;
		System.out.println("전진");
	}
	
	public void backward() {
		speed--;
		System.out.println("후진");
	}

}
