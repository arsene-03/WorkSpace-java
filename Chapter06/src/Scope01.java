
public class Scope01 {
	
	static String name="홍길동";

	public static void main(String[] args) {
		int age = 35;
		String Vaccine = "";
		if(age>=65) {
			Vaccine ="화이자";
			System.out.println(Vaccine+"백신 접종 대상입니다.");
		}else {
			System.out.println(Vaccine+"백신 접종 대상이 아닙니다.");
		}
		for(int i=0;i<5;i++) {
			String name = "이자겸";
			System.out.println(name +"님 안녕하세요");
		}
		System.out.println(name +"님 안녕하세요");
		
		hello();
	}

	public static void hello() {
		System.out.println(name +"님 안녕하세요");
	}
}
