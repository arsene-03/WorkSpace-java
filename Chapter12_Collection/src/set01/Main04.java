package set01;

import java.util.HashSet;
import java.util.Set;

public class Main04 {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
	
		names.add("송길동");     
		names.add("박길동");
		names.add("이길동");     
		names.add("고길동");
		names.add("복길동");
		names.add("홍길동");
		names.add("최길동");
		
		//향상된 for문으로 데이터 조회
		System.out.println("향상된 for문으로 데이터 조회");
		for(String name:names) {
			System.out.println("이름 : "+name);
		}
		

	}

}
