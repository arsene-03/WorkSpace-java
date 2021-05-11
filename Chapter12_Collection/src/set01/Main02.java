package set01;

import java.util.HashSet;
import java.util.Set;

public class Main02 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("고길동",5));
		set.add(new Student("박길동",17));
		set.add(new Student("홍길동",21));
		set.add(new Student("박길동",13)); // 이름은 같지만 번호가 다름 => 다른객체
		set.add(new Student("고길동",5)); //이름 + 번호가 같음 => 중복
		
		System.out.println("집합의 길이: "+set.size());
		set.add(new Student("홍길동",25));
		System.out.println("집합의 길이: "+set.size());
		set.add(new Student("박길동",17)); // 중복
		System.out.println("집합의 길이: "+set.size());
		

	}

}
