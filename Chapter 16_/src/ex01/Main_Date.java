package ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_Date {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String date = sdf.format(now);
		System.out.println(date);
		

	}

}
