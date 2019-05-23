package Hash.TlephoneDirectory;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String phone : phone_book) {
			map.put(phone, phone.length());
		}

		for (String key : map.keySet()) {
			for (String key2 : map.keySet()) {
				if (!key.equals(key2)) {
					if (map.get(key) <= map.get(key2)) {
						if (key.equals(key2.substring(0, map.get(key))))
							return false;
					}
				}
			}
		}

		return answer;
	}

	/*
    public boolean solution(String[] phoneBook) {
       for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }
	*/
	
	public static void main(String[] args) {
		String[] phone_book0 = { "119", "97674223", "1195524421" };
		String[] phone_book1 = { "123", "456", "789" };
		String[] phone_book2 = { "12", "123", "1235", "567", "88" };

		boolean player = solution(phone_book1);
		System.out.println(player);
	}

}
