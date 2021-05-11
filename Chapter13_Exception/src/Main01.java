import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main01 {

	public static void main(String[] args) {
//		 String str = null;
//		System.out.println(str.toString);
		
//		System.out.println("5/0: "+(5/0));
		
//		int[] num = {1,2,3};
//		System.out.println(num[3]);
		
		try {
			String data = "둘";
			int value = Integer.parseInt(data); //예외 발생 시점.
			System.out.println("안녕하세요");
			System.out.println("반갑습니다");
		}catch(NumberFormatException err) {
			System.out.println("숫자로 바꿀 수 없는 문자열 입니다.");
		}catch(NullPointerException err) {
			System.out.println("변수에 인스턴스가 없습니다.");
		}
		System.out.println("안녕히 가세요");
		
		System.out.println("=====간접처리======");
		
		
		try {
		int result = div(5,0);
//		}catch(ArithmeticException e) {
		}catch(Exception e) { ///떠넘길때 통채로 넘기면 받아줄때도 통채로 받아야함.
			System.out.println("0으로 나눌 수없습니다.");
		}
		
		
		// 반드시 예외 처리해야 하는 코드
		try {
			FileInputStream fis = new FileInputStream("text.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}
	private static int div(int a, int b) throws Exception{//throws ArithmeticException, NullPointerException{
																			//간접처리
		int c=0;
		c= a/ b;

				
//		매서드 내부에서 직접처리	
//		try {
//			c = a/b;
//		}catch(Exception e) {
//			e.printStackTrace(); //오류 잡아내기
//		}
		return c;
	}
}
