package Joins;


public class Solution1 {
	
	public static int solution(String phone_number) {
		// 유형 3일 경우
		if(phone_number.charAt(0) == '+') {
			String[] s = phone_number.split("-");
			
			// 4개로 나누어 지지 않았을 경우
			if(s.length != 4) {
				return -1;
			}
			else {
				if(!s[0].equals("+82")) return -1;
				if(!s[1].equals("10")) return -1;
				if(s[2].length() != 4) return -1;
				if(s[3].length() != 4) return -1;
				
				return 3;
			}
		}
		// 유형 1, 2일 경우
		else {
			String[] s = phone_number.split("-");
			
			// 유형 2 -> '-'가 없는 경우
			if(s.length == 1) {
				if(s[0].length() != 11) return -1;
				else {
					if(s[0].substring(0, 3).equals("010")) return 2;
					else return -1;
				}
			}
			// 유형 1
			else if(s.length == 3) {
				if(!s[0].equals("010"))	return -1;
				if(s[1].length() != 4) return -1;
				if(s[2].length() != 4) return -1;
				
				return 1;
			}
			else
				return -1;
				
		}
	}
	
	public static void main(String[] args) {
		String phone_number1 = "01012345678";
		String phone_number2 = "010-1234-3333";
		String phone_number3 = "+82-10-1234-5678";
		String phone_number4 = "+82-010-1234-5678";
		
		System.out.println(solution(phone_number1));
		System.out.println(solution(phone_number2));
		System.out.println(solution(phone_number3));
		System.out.println(solution(phone_number4));
	}
	
}
