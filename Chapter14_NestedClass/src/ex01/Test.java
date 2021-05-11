package ex01;

public class Test {
	String name;   // 1
	
	void method() {
		String name;  //2
		
		this.name = "";  // =>1
		name = "";       // =>2
		
	}
	
	class Member{
		String name;    //   3
		void method() {
			String name;   //4
			this.name = "";  //  =>3
			name = "";       //  =>4
			
			// 1번 name을 가르키기 위해서
			Test.this.name = "";   // => 1
			
		}
	}
}
