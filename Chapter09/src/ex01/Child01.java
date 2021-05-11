package ex01;

public class Child01 extends Parent01 {
	//상속은 자식 클래스에       extends 부모클래스이름
	//멤버가 없음.
	public Child01() {
		super("홍판서");//부모생성자를 호출
}	
	
	@Override // 어노테이션 : 메서드의 부가기능, 첨삭기능
	void method		() {//메소드 오버라이딩
	System.out.println("나는 자식입니다.");
}
	
}