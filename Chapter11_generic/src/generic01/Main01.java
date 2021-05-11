package generic01;


public class Main01 {

	public static void main(String[] args) {
		// 과일 담는 박스생성

				Box<Apple> aBox = new Box<Apple>();
				Box<Banana> bBox = new Box<Banana>();


				//과일 객체를 생성해서 박스에 담는다.
				aBox.set(new Apple());
				//aBox.set("Apple"); 애초에 Apple 타입만 들어갈 수있도록 설정이되서 에러가 남 
				bBox.set(new Banana());
				
				//박스에 과일을 꺼낸다.
				Apple ap = aBox.get(); //타입이 Apple로 나옴
				Banana bn = bBox.get(); // 타입이 Banana로 나옴

				//과일이 맞는지 체크
				System.out.println(ap.toString());
				System.out.println(bn.toString());

	}

}
