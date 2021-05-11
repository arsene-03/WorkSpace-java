public class Class01 {

	public static void main(String[] args) {
		String choiceColor = "skyblue";
		
		Car myCar =new Car(choiceColor);
		//Car 라고하는 데이터타입 변수이름 = Car라는 인스턴스
		
		System.out.println("내차 색상: "+myCar.color);
		myCar.forward();
		System.out.println("내차의 속도: "+myCar.speed);
		
		Car yourCar = new Car();

		System.out.println("당신의 속도: "+yourCar.speed);
		
		myCar.color = "pink";
		System.out.println("내차 색상: "+myCar.color);
		System.out.println("당신차 색상: "+yourCar.color);

	}

}
