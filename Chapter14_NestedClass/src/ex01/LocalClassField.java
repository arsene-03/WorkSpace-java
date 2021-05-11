package ex01;

public class LocalClassField {

	
	void method(int age) {
				// 매개 변수
		/// 로컬 변수
		final String name = "오리지널";
//		name = "변경";
		class D{
			void method(){
//				name = "변경";// final 붙어 있다고 간주 => 변경 불가
				System.out.println(name);  // final 붙어 있다고 간주
				System.out.println(age);
			}

		}

		D d = new D();
		
	}
}
