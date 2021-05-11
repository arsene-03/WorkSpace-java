package map01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main02 {

	public static void main(String[] args) {
		Map<String,Integer> javaScores = new HashMap<>();

		javaScores.put("고길동",80);
		javaScores.put("송길동",78);
		javaScores.put("백길동",69);
		javaScores.put("최길동",91);
		javaScores.put("양길동",86);
		
		// 1. key를 Set으로 변환후 전체 데이터 조회
		System.out.println("--- key를 Set으로 변환---");
		Set<String> keySet = javaScores.keySet();
		
		Iterator<String> keyItr = keySet.iterator();
		
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			Integer value = javaScores.get(key);
			
			System.out.println("이름 : "+key+", 점수 : "+value);
		}
		
		// 2. Entry를 Set으로 변환후 전체 데이터 조회
		System.out.println("--- Entry를 Set으로 변환---");
		Set<Map.Entry<String,Integer>> entrySet = javaScores.entrySet();
		
		Iterator<Map.Entry<String,Integer>> entryItr = entrySet.iterator();
		
		while(entryItr.hasNext()){
			Map.Entry<String,Integer> entry = entryItr.next();
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("이름 : "+key+", 점수 : "+value);
		}
		
		
		
		

	}

}
