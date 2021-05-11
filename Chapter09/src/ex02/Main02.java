package ex02;

public class Main02 {

	public static void main(String[] args) {
		ConvertibleCar myCar = new ConvertibleCar();
		SuvCar yourCar = new SuvCar();
		
				
//		method1(myCar);
//		method2(yourCar);
		
		
		method(myCar);
		method(yourCar);
		
	}
	
	
	private static void method(Car car) {
		car.forward();
		
		if(car instanceof ConvertibleCar) {
          //    ture나 false가 나오는 연산자인데 Convertible로 형변환이 가능하겠는가? 묻는 연산
			ConvertibleCar myCar =(ConvertibleCar)car;
			myCar.open();
		}
		
		
	}
//	private static void method2(SuvCar yourCar) {
//		yourCar.forward();
		
//	}
//	public static void method1(ConvertibleCar car) {
//		car.forward();
		
		
				
		
//	}


}
