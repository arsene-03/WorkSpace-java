package ex01;

public class Main01 {

	public static void main(String[] args) {
		//Car myCar = new Car(); 인스턴스 생성불가 
		Car yourCar = new GenesisCar();
		
		yourCar.forward();
		yourCar.backward();
	}

}
