
public class Card {
	//생성자가 -> 반드시 생성자가 있어야 인스턴스를 만듦
	//생성자를 만들지 않으면 =>컴파일러가 자동생성
	int number = 1;
	boolean chk = true; // true 라면 k 가찍히고, false 라면 k가 안찍힌다
	
	
	public Card(int number, boolean chk) {
		this.number = number; // 인스턴스 생성시 입력한 number로 인스턴스 내부의 number 필드를 초기화
		this.chk = chk;
	}
	
	public Card() {
		
	}
	//메서드 오버로딩

	public String info() {
		String str = "";
		
		if(chk) {
			str = String.valueOf(number)+"k";
		}else {
			str = String.valueOf(number);
			// 숫자를 문자열로 변환
		}
		
		
		return str;
	}
	
}	
		