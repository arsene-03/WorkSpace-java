
public class MethodOverLoading {

	public static void main(String[] args) {
		info("홍길동"); // 1번째 메서드 호출됌
		info("홍길동",25); // 2번째 메서드 호출
		info("hong","1234");//3번째 메서드 호출
		info(150,"이것이 자바다"); //4번재 메서드 호출

	}
	public static void info(String name) {//1.
		System.out.println("이름: "+name);
	}
	
	public static void info(String name,int age) {//2. 1번타입과 개수가 달라 다른 메서드로 판단
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	
	public static void info(String id, String password) {//3. 2번과 타입이 달라 다른 메서드로 판단
		System.out.println("아이디: "+id);
		System.out.println("비밀번호: "+password);
	}
	public static void info(int page, String title) { //4. 3번과 앞뒤 순서가 달라 다른 메서드로 판단
		System.out.println("책 제목: "+title);
		System.out.println("페이지: "+page);
	}
//	public static void info(String title, String chapter) {//5. 3번과 타입, 개수개 같아 기능 x
//		System.out.println("책 제목: "+title);
//		System.out.println("챕터: "+page);
//	}
}
