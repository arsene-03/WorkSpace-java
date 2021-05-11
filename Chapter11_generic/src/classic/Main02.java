package classic;

public class Main02 {

	public static void main(String[] args) {
		// 과일 담는 박스생성

		Box aBox = new Box();
		Box bBox = new Box();


		//과일 객체를 생성해서 박스에 담는다.
		aBox.set(new Apple());
		bBox.set(new Banana());
		
		//박스에 과일을 꺼낸다.
		Apple ap = (Apple)aBox.get(); //타입이 Objcet 가 나오므로 강제 형변환 시킴
		Banana bn = (Banana)bBox.get();

		//과일이 맞는지 체크
		System.out.println(ap.toString());
		System.out.println(bn.toString());

	}

}
