
public class Opperater {

	public static void main(String[] args) {
		int num1 = 5;
		System.out.println(++num1); // 6
		System.out.println(++num1); // 7
		System.out.println(num1);   // 7
		System.out.println();
		int num2 = 5;
		System.out.println(num2++);// 5
		System.out.println(num2++);// 6
		System.out.println(num2);//   7
		System.out.println();
		
		int a = 10;
		int b = 20;
		
		int result = a++ * ++b;
		//            10   20
		//            10   21
		//   210      10  * 21
		//            11   21
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("result : "+result);
		
		System.out.println();
		//나누기
		int i = 5/2;
		System.out.println("i : "+i);
		double j = 5/2;
		System.out.println("j : "+j);
	    double k = (double)5/2;
		System.out.println("k : "+k);
		
		System.out.println();
								
		int f = 10;
		f+=10;
		System.out.println("f : "+f);
		
	   
		
				
				
		// TODO Auto-generated method stub

	}

}
