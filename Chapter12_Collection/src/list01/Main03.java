package list01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("고길동");
		names.add("안현필");
		names.add("홍성대");
		names.add("한석원");
		names.add("설민석");

		// 1. 단순 반복을 이용하는 방법
		System.out.println("1. 단순 반복을 이용해서 데이터 출력");
		for(int i=0;i<names.size();i++) {
			System.out.println("이름 : "+names.get(i));
		}


		// 2. 반복자를 이용해서 데이터를 꺼내 봅시다.
		System.out.println("2. 반복자을 이용해서 데이터 출력");
		Iterator<String> itr = names.iterator();

		while(itr.hasNext()) {
			System.out.println("이름 : "+itr.next());
		}

		// 3. 반복자를 활용한 특수 반복문을 사용해서 데이터 출력
		System.out.println("3. 반복자을 이용한 특수반복문 데이터 출력");

		for(String name:names) {  // 향상된 for문 : for-Each문
			System.out.println("이름 : "+name);
		}

	}

}
