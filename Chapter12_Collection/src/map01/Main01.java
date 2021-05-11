package map01;

import java.util.HashMap;
import java.util.Map;

public class Main01 {

	public static void main(String[] args) {
		Map<String,Integer> javaScores = new HashMap<>();

		javaScores.put("고길동",80);
		javaScores.put("송길동",78);
		javaScores.put("백길동",69);
		javaScores.put("최길동",91);
		javaScores.put("양길동",86);
	
		System.out.println("맵 크기 : "+javaScores.size());
		
		javaScores.put("홍길동",97);
		System.out.println("맵 크기 : "+javaScores.size());
		System.out.println("백길동의 점수 : "+javaScores.get("백길동"));
		
		
		System.out.println("송길동의 점수 : "+javaScores.get("송길동"));
		javaScores.put("송길동",87);
		System.out.println("맵 크기 : "+javaScores.size());
		System.out.println("송길동의 점수 : "+javaScores.get("송길동"));
		
		javaScores.remove("최길동");
		System.out.println("맵 크기 : "+javaScores.size());
	}

}
