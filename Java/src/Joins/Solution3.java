package Joins;

public class Solution3 {

	 public static int d(int s, int termSize) {
	        int n = termSize - 1;
	        while (n != 0) {
	           if (s % n == 0) {
	               return n;
	           }

	           n--;
	        }
	        return n;
	    }

	    public static int solution(String s) {
	        int termSize = s.length();
	        int answer = termSize;

	        while (termSize >= 1) {
	        	/*
	            if (s.length() % termSize != 0) {
	                termSize = (int)(Math.ceil(termSize / 2.));
	                continue;
	            }
	            */
	            int iteration = s.length() / termSize;
	            int flag = 1;
	            String pivot = s.substring(0, termSize);
	            for (int i = 1; i < iteration; i++) {
	                if (!s.substring(i * termSize, (i + 1) * termSize).equals(pivot)) {
	                    flag = 0;
	                }
	            }
	            if (flag == 1) {
	                answer = termSize;
	            }
	            
	            // System.out.println("termSize : " + termSize);
	            termSize = d(s.length(), termSize);
	        }
	        return answer;
	    }


	public static void main(String[] args) {

		System.out.println(solution("abababab"));
	}

}
