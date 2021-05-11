
public class Q03 {

	public static void main(String[] args) {
		Student studentr1 = new Student();
		studentr1.name = "고길동";
		studentr1.ban = 3;
		studentr1.no = 17;
		studentr1.kor = 92;
		studentr1.eng = 63;
		studentr1.math = 74;
		
		System.out.println("이름 : "+studentr1.name);
		System.out.println("총점 : "+studentr1.getTotal());
		System.out.println("평균 : "+studentr1.getAverage());
		
		
	}

}


