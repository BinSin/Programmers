package CyberLogitech;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	static public int solution(String s1, String s2) {
		int answer = 0;
		int s1Lenth = s1.length();
		int sameLength = 0;
		int min = Math.min(s1.length(), s2.length());
		for (int i = 0; i <= min; i++) {
			if (s2.substring(0, i).equals(s1.substring(s1Lenth - i, s1Lenth))) {
				sameLength = i;
			}
		}

		answer = s1Lenth + s2.length() - sameLength;
		return answer;
	}

	public static void main(String[] args) {
		String s1 = "ababca";
		String s2 = "hhh";
		System.out.println(solution(s1, s2));
	}
}
