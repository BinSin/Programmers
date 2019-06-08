package Joins;

import java.util.HashMap;

public class Solution4 {

	public static String[] solution(String[] card, String[] word) {
		String[] answer = null;
		int aIndex = 0;

		HashMap<Character, Integer>[] cardStore = new HashMap[3];
		for(int i=0; i<3; i++) {
			cardStore[i] = new HashMap<Character, Integer>();
		}

		for (int i = 0; i < card.length; i++) {
			char[] cardArr = card[i].toCharArray();
			for (int j = 0; j < card[i].length(); j++) {
				cardStore[i].put(cardArr[j], cardStore[i].getOrDefault(cardArr[j], 0) + 1);
			}
		}
		
		
		if (answer == null) {
			answer = new String[1];
			answer[0] = "-1";
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] card1 = { "ABACDEFG", "NOPQRSTU", "HIJKLKMM" };
		String[] card2 = { "AABBCCDD", "KKKKJJJJ", "MOMOMOMO" };

		String[] word1 = { "GPQM", "GPMZ", "EFU", "MMNA" };
		String[] word2 = { "AAAKKKKKMMMMM", "ABCDKJ" };

		System.out.println(solution(card1, word1));
		System.out.println();
		System.out.println(solution(card2, word2));

	}

}
