package NTS;

public class Solution2 {
	
	static public String solution(String start, String end) {
		String answer = "";
		
		// start의 시, 분 , 초
		int sHour = 0;
		int sMinute = 0;
		int sSecond = 0;
		// end의 시, 분 , 초
		int eHour = 0;
		int eMinute = 0;
		int eSecond = 0;
		
		// start와 end의 AM/PM 이 다르면 end 시간에 12를 더해야 한다.
		String sAP = start.substring(0, 2);
		String eAP = end.substring(0, 2);
		if(!sAP.equals(eAP)) {
			eHour += 12;
		}
		
		// start와 end 시 분 초 나누기
		String sstart = start.substring(3);
		String eend = end.substring(3);
		String[] sArr = sstart.split(":");
		String[] eArr = eend.split(":");
		
		sHour += Integer.parseInt(sArr[0]);
		sMinute += Integer.parseInt(sArr[1]);
		sSecond += Integer.parseInt(sArr[2]);
		
		eHour += Integer.parseInt(eArr[0]);
		eMinute += Integer.parseInt(eArr[1]);
		eSecond += Integer.parseInt(eArr[2]);
		
		int aHour = 0;
		int aMinute = 0;
		int aSecond = 0;
		// start와 end의 차이 구하기
		if(eSecond < sSecond) {
			eSecond += 60;
			eMinute -= 1;
			if(eMinute < 0) {
				eMinute += 60;
				eHour -= 1;
			}
		}
		aSecond = eSecond - sSecond;
		
		if(eMinute < sMinute) {
			eMinute += 60;
			eHour -= 1;
		}
		aMinute = eMinute - sMinute;
		
		// 중요!! end가 start 보다 크면 aHour는 음수가 나오고 이는 24를 더해야 한다.
		if(eHour < 0) {
			eHour += 24;
		}
		aHour = eHour - sHour;
		
		
		if(aHour < 10) {
			answer += "0";
		}
		answer += aHour + ":";
		
		if(aMinute < 10) {
			answer += "0";
		}
		answer += aMinute + ":";
		
		if(aSecond < 10) {
			answer += "0";
		}
		answer += aSecond;
		
		return answer;
	}
	
	public static void main(String[] args) {
		String start = "PM 00:00:01";
		String end = "PM 00:00:00";
		
		System.out.println(solution(start, end));
	}
}
