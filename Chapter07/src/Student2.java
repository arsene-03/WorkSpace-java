
public class Student2 {
	String name;
	int javaScore;
	int oracleScore;
	int pythonScore;
	
	
	public Student2(String name, int javaScore, int oracleScore, int phythonScore) {
		
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
		this.pythonScore = phythonScore;
	}
	
	public void prt() {
		System.out.println("이름 : "+name);
		System.out.println("자바 점수 : "+javaScore);
		System.out.println("오라클 점수 : "+oracleScore);
		System.out.println("파이썬 점수 : "+pythonScore);
	}
}

