package set01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main01 {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		
		names.add("고길동");
		names.add("김길동");
		names.add("홍길동");
		names.add("고길동");
		names.add("박길동");
		
		System.out.println("집합의 길이: "+names.size()); 
		//고길동 중복이 있기때문에 5개가 아닌 4개로 판단
		
		names.add("홍길동");
		System.out.println("집합의 길이: "+names.size());  
		//홍길동 중복이 있기때문에 5개가 아닌 4개로 판단
		
		Iterator<String> itr = names.iterator(); // 반복자 호출 => 1회용
		
		while(itr.hasNext()) {//다음에 꺼낼 데이터가 있는가?
			String name = itr.next(); // 다음 데이터를 꺼내는 메서드
			System.out.println("이름: "+name);	
		}
//		String name = itr.next();
//		System.out.println("이름: "+name);
//		에러 발생
		System.out.println("-----------------------");
		itr = names.iterator(); // 데이터를 다시 꺼내고 싶다면 반복자를 다시 호출해야 한다.
		String name = itr.next();
		System.out.println("이름: "+name);
		
		names.remove("박길동");
		System.out.println("집합의 길이: "+names.size());
		names.clear();
		System.out.println("집합의 길이: "+names.size());
		
		if(names.isEmpty()) { //집합 내 데이터가 없는가?
			System.out.println("데이터 없음");
		}
	}

}
