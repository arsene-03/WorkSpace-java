package ex02;

public class Main01 {

	public static void main(String[] args) {
		Car myCar = new ConvertibleCar();
	//               forward,backward,open
		myCar.forward();
		myCar.backward();
//		myCar.open();     <= car클래스에는 open을 몰라서 사용할수없음
		
		///////////////////////////////////////////////////////////
		Car yourCar = new SuvCar();
		//               forward(오버라이딩),backward(오버라이딩)
		yourCar.forward();
		yourCar.backward();
		
		SuvCar hisCar = (SuvCar)yourCar;
		hisCar.forward();
		hisCar.backward();
		
		
		
	}

	
	
	public void method() {
		
		
		
		
		
		
	}
}

