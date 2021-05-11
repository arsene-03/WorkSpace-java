import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이를 입력하세요");
		int age = Integer.parseInt(scan.nextLine());

		try {
			method(age);
		} catch (MyException e) {
//			e.printStackTrace();//예외 발생 위치 추적
			System.out.println("예외발생사유: "+e.getMessage());
		}
		

	}
	private static void method(int age) throws MyException {
		if(age<65) {
			throw new MyException("코로나 백신접종 대상이 아닙니다."); // 떠넘기기 밖에 못함
		}
		
	}
}
