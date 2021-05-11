package ex02;

public class SuvCar extends Car {

	@Override
	public void forward() {
		super.speed +=2;
		System.out.println("4WD로 전진합니다.");
	}
	
	

}
