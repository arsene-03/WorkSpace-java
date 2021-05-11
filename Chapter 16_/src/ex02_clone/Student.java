package ex02_clone;

public class Student implements Cloneable{
	String name;
	int age;
	int[] scores;
	
	public Student(String name, int age, int[] scores) {
		this.name = name;
		this.age = age;
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age+", 점수: "+scores[0] ;
	}

	public Student shallowCopy() {  //얉은 복제
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException err) {
			err.printStackTrace();
		}
		return (Student)obj;
	}
		
	public Student deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException err) {
			err.printStackTrace();
		}
		
		Student s = (Student)obj;
		s.scores = new int[] {this.scores[0]};
		//내부 필드인 배열을 새롭게 만들어서 복제
		
		
		return s;
	}


}





