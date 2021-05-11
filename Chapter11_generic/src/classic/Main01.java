package classic;

public class Main01 {

	public static void main(String[] args) {
		// 과일 담는 박스생성
		AppleBox aBox = new AppleBox();
		BananaBox bBox = new BananaBox();
		
		//과일 객체를 생성해서 박스에 담는다.
		aBox.set(new Apple());
		bBox.set(new Banana());
		
		//박스에 과일을 꺼낸다.
		Apple ap = aBox.get();
		Banana bn = bBox.get();
	
		//과일이 맞는지 체크
		System.out.println(ap.toString());
		System.out.println(bn.toString());
	}
	

}
