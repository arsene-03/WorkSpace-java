package q3;

public class Member {
	private String studentId;
	private int engScore;
	private int korScore;
	private int mathScore;
	private int highScore;
	private int sum;
	private double avt;
	
	public Member(int engScore, int korScore, int mathScor) {
		this.studentId = studentId;
		this.engScore = engScore;
		this.korScore = korScore;
		this.mathScore = mathScor;
		this.sum = engScore+korScore+mathScore;
		this.avt = sum/3.0;
		this.highScore = high();;
	}

	private int high() { 
		int[] score = {this.engScore,this.korScore,this.mathScore};
		int max = 0;
		for(int i=0;i<3;i++) {
			if(max<score[i]) {
				max = score[i];
		}
	}
		return max;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvt() {
		return avt;
	}

	public void setAvt(double avt) {
		this.avt = avt;
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	
	
	
}
