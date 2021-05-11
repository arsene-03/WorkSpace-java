package ex01;

import java.util.Calendar;

public class Main_Calendar {

	public static void main(String[] args) {
		Calendar now= Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONDAY)+1; // 1월이 0임
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year+"년");
		System.out.println(month+"월");
		System.out.println(day+"일");
		System.out.println(week+"요일");
		System.out.println(amPm+"AM/Pm");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		
	}

}
