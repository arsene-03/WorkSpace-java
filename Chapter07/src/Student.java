
public class Student {
	String name ;
	int ban ;
	int no  ;
	int kor ;
	int eng ;
	int math ;
	

public Student() {
	
}
		
public Student(String name, int ban, int no, int kor, int eng, int math) {
	
	this.name = name;
	this.ban = ban;
	this.no = no;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}

//	public Student (String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no=no;
//		this.kor=kor;
//		this.eng=eng;
//		this.math=math;
//	}


public int getTotal() {
	int sum = this.kor+this.eng+this.math;
	return sum;
}
public float getAverage() {
	float avg= getTotal()/3.0f; //this.getTotal()로 해도 상관없지만 일반적으로 메서드는 this를 사용하지 않는다.
	avg=Math.round(avg*100)/100.0f;
	return avg; 
}



public String info() {

	String a = "이름: "+name+"\n반: "+ban+"\n번호: "+no+"\n국어점수: "+kor+"\n영어점수: "+eng+"\n수학점수: "+math+"\n총점: "+getTotal()+"\n평균: "+getAverage();
	
	return a;
}
}