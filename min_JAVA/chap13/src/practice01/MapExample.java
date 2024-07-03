package practice01;

import java.util.*;


public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			
			totalScore += entry.getValue();
			
			if (maxScore < entry.getValue()) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
		}
		
		double avgScore = (double) totalScore / map.size();
		
		System.out.println("평균점수 : " + avgScore);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("촤고점수를 받은 아이디" + name); 
		
	}
}
