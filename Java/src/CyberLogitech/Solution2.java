package CyberLogitech;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution2 {
	static public int[] solution(int[] grade) {
		int gradeLength = grade.length;
		int[] answer = new int[gradeLength];
		int[] order = grade.clone();
		Arrays.sort(order);
		
		Map<Integer, Integer> countMap = new HashMap<>(); // <grade, count>
		for(int g : grade) {
			countMap.put(g, countMap.getOrDefault(g, 0) + 1);
		}
		Set s = countMap.keySet();
		Iterator<Integer> it = s.iterator();
		
		Map<Integer, Integer> rankMap = new HashMap<>(); // <grade, rank>
		int rank = 1;
		while(it.hasNext()) {
			int next = it.next();
			System.out.println(next);
			rankMap.put(next, rank);
			rank += countMap.get(next);
		}
		
		for(int i=0; i<gradeLength; i++) {
			answer[i] = rankMap.get(grade[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int[] grade = {2,2,1};
		int[] grade2 = {3,2,1,2};
		for(int i=0; i<grade.length; i++) {
			System.out.print(solution(grade)[i] + " ");
		}
		System.out.println();
		for(int i=0; i<grade2.length; i++) {
			System.out.print(solution(grade2)[i] + " ");
		}
	}
}
