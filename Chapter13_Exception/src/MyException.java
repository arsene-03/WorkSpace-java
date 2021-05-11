
public class MyException extends Exception{
	public MyException() {}
	public MyException(String str) {
		super(str); // 예외 발생 이유를 부모 클래스에 넘겨주기.
	}
}
