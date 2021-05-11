package list01;

import java.util.LinkedList;
import java.util.List;

public class Main02 {

	public static void main(String[] args) {
		
		List<String>names = new LinkedList<>();{
			//<String> => 앞뒤 둘다있으니 하나는 생략해도됌
			names.add("고길동");// idx =0
			names.add("안현필");// idx =1
			names.add("홍성대");// idx =2
			names.add("한석원");// idx =3
			names.add("설민석");// idx =4
			
			
			System.out.println("리스트의 길이: "+names.size());
			
			System.out.println("3번째 사람 이름: "+names.get(2));
			
			String name1 = names.get(1);
			System.out.println("2번째 사람이름: "+name1);
			System.out.println("4번째 사람 이름: "+names.get(3));
			System.out.println("---4번에 최진기 끼워넣기---");
			names.add(3,"최진기");
			System.out.println("4번째 사람 이름: "+names.get(3));
			System.out.println("5번째 사람 이름: "+names.get(4));
			//0 고길동
			//1 안현필
			//2 홍성대
			//3 최진기
			//4 한석원
			//5 설민석
			System.out.println("리스트의 길이: "+names.size());
			System.out.println(("2번째 사람이름: "+name1));
			System.out.println("---2번에 안현필 삭제---");
			names.remove(1);
			System.out.println(("2번째 사람이름: "+names.get(1)));
				//0 고길동
					//1 홍성대
					//2 최진기
					//3 한석원
					//4 설민석
			
			
			System.out.println("--------------------------");
			for(int i=0;i<names.size();i++) {
				//		names.legnth xx <-배열 
				System.out.println((i+1)+"번째 사람이름: "+names.get(i));
				//                                      names[i] xx  <-배열
			}	
		

	}
	}
	
}
