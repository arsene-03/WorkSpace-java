package ex01;

public class main01 {

	public static void main(String[] args) {
		Child01 child = new Child01();
		child.name = "홍길동";
		System.out.println("이름 : "+child.name);
		child.method();
		
//		child.property = "금괴";   private를 이용하여 접근을 막음
//		child.method2();

	}

}
