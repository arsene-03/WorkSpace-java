package ex02_clone;

public class Main02 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동",25,new int[] {90});
		Student s2 = s1.shallowCopy();
		Student s3 = s1.deepCopy();
		
		System.out.println("s1 : "+s1.toString());
		System.out.println("s2 : "+s2.toString());
		System.out.println("s3 : "+s3.toString());
		System.out.println("----------------------------------");
		
		s1.age=30;
		s1.name = "고길동";
		s1.scores[0] = 80;

		System.out.println("s1 : "+s1.toString());
		System.out.println("s2 : "+s2.toString());
		System.out.println("s3 : "+s3.toString());
	}

}
