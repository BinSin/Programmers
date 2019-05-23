package Hash.DidntCompleteAPlayer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<String, Integer>();
        for(int i=0; i<participant.length; i++) {
        	String player = participant[i];
        	if(participantMap.containsKey(player))
        		participantMap.put(player, participantMap.get(player)+1);
        	else
        		participantMap.put(player, 1);
        }
        
        Map<String, Integer> completionMap = new HashMap<String, Integer>();
        for(int i=0; i<completion.length; i++) {
        	String player = completion[i];
        	if(completionMap.containsKey(player))
        		completionMap.put(player, completionMap.get(player)+1);
        	else
        		completionMap.put(player, 1);
        }
        
        for(int i=0; i<participant.length; i++) {
        	String player = participant[i];
        	if(!completionMap.containsKey(player) || 
        			!participantMap.get(player).equals(completionMap.get(player))) {
        		answer = player;
        		break;
        	}
        }
        
        return answer;
    }
	
	/*
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        for (String player : completion) hm.put(player, hm.get(player) - 1);

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	            }
	        }
	        return answer;
	    }
	}
	*/
	
	public static void main(String[] args)  {
		String[] participant = {"mislav", "stanko", "mislav", "ana" };
		String[] completion = {"stanko", "ana", "mislav"};
		
		String player = solution(participant, completion);
		System.out.println(player);
	}
}
