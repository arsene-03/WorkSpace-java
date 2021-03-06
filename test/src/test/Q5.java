package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q5 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();

		map.put("red", 92);
		map.put("green", 87);
		map.put("blue", 85);
		map.put("pink", 93);
		map.put("yellow", 89);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		double average = 0.0;
		///// 1. entry set

		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

		Iterator<Map.Entry<String,Integer>> entryItr = entrySet.iterator();

		while(entryItr.hasNext()){
			Map.Entry<String,Integer> entry = entryItr.next();

			String key = entry.getKey();
			Integer value = entry.getValue();

			totalScore += value;
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}

		}
		average = totalScore/(double) map.size();

		System.out.println("총점 : "+totalScore);
		System.out.println("평균 : "+average);
		System.out.println("최고점수 : "+maxScore);
		System.out.println("최고 득점자: "+name);

		////2. keyset

		name = null;
		maxScore = 0;
		totalScore = 0;
		average = 0.0;

		Set<String> keySet = map.keySet();

		Iterator<String> keyItr = keySet.iterator();

		while(keyItr.hasNext()) {
			Map.Entry<String,Integer> entry = entryItr.next();

			String key = entry.getKey();
			Integer value = entry.getValue();

			totalScore += value;
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
			average = totalScore/(double) map.size();

			System.out.println("총점 : "+totalScore);
			System.out.println("평균 : "+average);
			System.out.println("최고점수 : "+maxScore);
			System.out.println("최고 득점자: "+name);



		}

	}
}




