
public class operator02 {

	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		
		System.out.println("str1 == str2: "+(str1==str2));
		
		System.out.println();
		
		//
		
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		
		System.out.println("str3 : "+ str3);
		System.out.println("str4 : "+ str4);
		System.out.println();
		System.out.println("str3 == str4 : "+(str3==str4));
		System.out.println("str3.equals(str4) : "+ (str3.contentEquals(str4)));
		
		//
		System.out.println();
		//
		int a = 3;
		System.out.println(a<<1);
		System.out.println(a<<2);		
		System.out.println(a<<3);
		
		//
		System.out.println();
		//
		int b = 24;
		System.out.println(b>>1);
		System.out.println(b>>2);
		System.out.println(b>>3);
		
		//
		
		
		// TODO Auto-generated method stub

	}

}
