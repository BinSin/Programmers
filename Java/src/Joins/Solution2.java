package Joins;

public class Solution2 {
	
	public static int solution(int N, int[] sequence) {
		int answer = Math.min(sequence[0] - 1, N - sequence[0] + 1);
		
		for(int i=0; i<sequence.length-1; i++) {
			int start = sequence[i];
			int end = sequence[i+1];
			int one = Math.abs(start - end);
			
			int min = Math.min(start, end);
			if(start == min) {
				start += N;
			}
			else {
				end += N;
			}
			int two = Math.abs(start - end);
			
			answer += Math.min(one, two);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int N = 5;
		int[] sequence1 = {1,2,3,4,5};
		int[] sequence2 = {3,5,4,1,2};
		
		System.out.println(solution(N, sequence1));
		System.out.println(solution(N, sequence2));
	}
}
