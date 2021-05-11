
public class Car {
	//멤버 필드
	String color = "white";
	int speed = 0;
	{
	//초기화 블록	
		
	}
	//생성자 (= 반환타입이 없는 메서드) 인스턴스의 초기화를 담당.
		// 인스턴스를 생성 할 때
	
	public Car(String choiceColor) {
		color = choiceColor;
		System.out.println("빰빰빰!! 차량 구매를 축하합니다");
	}
	public Car() {
		System.out.println("빰빰빰!! 차량 구매를 축하합니다");
	}
	
	//멤버 메서드
	public void forward() {
		System.out.println("전진");
		speed++;
	}
	
	public void backward() {
		System.out.println("후진");
		speed--;
	}

}
