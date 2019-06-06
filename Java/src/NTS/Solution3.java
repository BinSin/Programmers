package NTS;

public class Solution3 {
	
	static public int solution(int[] bricks) {
        int answer = 0;
        
        int index = 0;
        for(int i=0; i<bricks.length; i++) {
        	if(bricks[i] != 0) {
        		index = i;
        		break;
        	}
        }
        
        boolean updown = true;
        int point = bricks[index];
        int remind = 0;
        
        // 높이가 0이 아닐때 시작
        for(int i=index+1; i<bricks.length; i++) {
        	// point 보다 높은 것 찾기
        	if(updown) {
        		if(point >= bricks[i]) {
        			remind += (point - bricks[i]);
        		}
        		else {
        			answer += remind; // 모아둔 것 더하고
        			updown = false;
            		remind = 0; // 다시 0으로 리셋
            		
        			for(int j=i; j<bricks.length-1; j++) {
        				if(point <= bricks[j+1]) {
        					point = bricks[j];
        					i++;
        				}
        				else {
        					break;
        				}
        			}
        		}
        	}
        	// point 보다 낮을 떄 찾기
        	else {
        		if(point <= bricks[i]) {
        			remind += (point - bricks[i]);
        		}
        		else {
        			answer += remind; // 모아둔 것 더하고
        			updown = true;
            		remind = 0; // 다시 0으로 리셋
            		
        			for(int j=i; j<bricks.length-1; j++) {
        				if(point >= bricks[j+1]) {
        					point = bricks[j];
        					i++;
        				}
        				else {
        					break;
        				}
        			}
        		}
        	}
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] bricks = {0, 2, 0, 1, 3, 1, 2, 0, 1, 0, 2, 0};
		int[] bricks2 = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(solution(bricks));
		System.out.println(solution(bricks2));
		
	}
}
