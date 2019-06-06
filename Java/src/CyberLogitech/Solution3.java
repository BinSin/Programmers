package CyberLogitech;

public class Solution3 {
	static public int solution(int[] histogram) {
		int answer = 0;
		for(int i=0; i<histogram.length-2; i++) {
			int area = 0;
			for(int j=i+2; j<histogram.length; j++) {
				int height = Math.min(histogram[i], histogram[j]);
				int width = j - i - 1;
				area = height * width;
				
				if(answer < area)
					answer = area;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		int[] histogram = {2, 2, 2, 3};
		int[] histogram2 = {6,5,7,3,4,2};
		
		System.out.println(solution(histogram));
		System.out.println(solution(histogram2));
	}
}
