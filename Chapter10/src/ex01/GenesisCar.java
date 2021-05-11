package ex01;

public class GenesisCar extends Car{

	@Override
	public void forward() {
		System.out.println("전진");
		
	}

	@Override
	public void backward() {
		System.out.println("후진");
		
	}
	
}
