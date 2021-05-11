
public class Method02 {

	public static void main(String[] args) { // 입력 o, 출력 o
		int a =3;
		int b =5;
		
		int result= add(a,b);
		System.out.println("합계: "+result);
	}
	private static int add(int a, int b) {
		int c= a+b;
		return c;
	}

}
