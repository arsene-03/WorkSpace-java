package ex03;

public class SamsungPrint implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("삼성 프린터");
		System.out.println(doc+"를 출력합니다.");
	}
	
	
}
