package set01;

import java.util.Iterator;
import java.util.TreeSet;

public class Main03 {

	public static void main(String[] args) {
//		Set<String> names = new TreeSet<>();
//     add, size, remove~~        +   first, last~~~
		
		TreeSet<String> names = new TreeSet<>();
		// 고  박  복  송  이  최  홍
		names.add("송길동");     
		names.add("박길동");
		names.add("이길동");     
		names.add("고길동");
		names.add("복길동");
		names.add("홍길동");
		names.add("최길동");
		
		System.out.println("첫번째 이름 : "+names.first());
		System.out.println("첫번째 이름 : "+names.last());
		System.out.println("송길동 바로 아래 이름 : "+names.lower("송길동"));
		System.out.println("신길동 바로 위 이름 : "+names.higher("신길동"));
		System.out.println("복길동 이거나 바로 아래 이름 : "+names.floor("복길동"));
		System.out.println("배길동 이거나 바로 위 이름 : "+names.ceiling("배길동"));
		
		System.out.println("----------------------------------");
		Iterator<String>  itr = names.iterator();
		
		while(itr.hasNext()) {
			System.out.println("이름 : "+itr.next());
		}
		System.out.println("--------------------------");
		System.out.println("꺼내기 전 개수 : "+names.size());
		for(int i=0;i<7;i++) {
			System.out.println("이름 : "+names.pollFirst());
		}
		
		System.out.println("꺼낸 후 개수 : "+names.size());
		

	}

}
