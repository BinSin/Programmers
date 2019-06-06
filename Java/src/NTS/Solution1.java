package NTS;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution1 {

	static public String solution(String s) {
		String answer = "";
		char[] cArr = s.toLowerCase().toCharArray();
		
		// Key 순으로 오름차순 정렬된다.
		Map<Character, Integer> hm = new TreeMap<>();
		
		for(int i=0; i<s.length(); i++) {
			hm.put(cArr[i], hm.getOrDefault(cArr[i], 0) + 1);
		}
		
		int max = 0;
		Iterator<Character> it = hm.keySet().iterator();
		while(it.hasNext()) {
			char c = it.next();
			if(hm.get(c) > max) {
				answer = c + "";
				max = hm.get(c);
			}
			else if(hm.get(c) == max) {
				answer += c;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String a = "aAb";
		String b = "BA";
		String c = "BbA";
		String d = "zyqwert";
		
		System.out.println(solution(a));
		System.out.println(solution(b));
		System.out.println(solution(c));
		System.out.println(solution(d));
	}
}
