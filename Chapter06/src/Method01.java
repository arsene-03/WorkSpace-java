
public class Method01 {

	public static void main(String[] args) {
		//함수를 실행시키는 방법 => 함수의 이름을 실행하면 된다.(함수의 호출)
		
		hello();
		String name= "조다";
		introduce(name);
		
		int num = dice();
		System.out.println(num);
		
		
	}
	
	public static void hello() { //함수  => 입력 x,출력x
		//함수가 작동되기 위한 기능 모음
		System.out.println("안녕하세요!!");
	}
	
	public static void introduce(String name) { // 입력 o, 출력x
		System.out.println(name+"님 환영합니다");
	}
	
	public static int dice() { // 입력 x, 출력0
		int dice = (int)(Math.random()*6)+1;
		return dice;
	}
	

}
