package ex03;

public class LgPrint implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("LG 프린터");
		System.out.println(doc+"를 출력합니다.");
	}

}
