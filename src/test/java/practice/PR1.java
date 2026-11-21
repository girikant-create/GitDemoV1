package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class PR1 {

	
	public static void main(String[] args) {
		 System.out.println(findFirstUnique("aaaaaaaaacccc")); 

	}
	
	 public static Character findFirstUnique(String str) {
	        if (str == null || str.isEmpty()) return null;

	        // LinkedHashMap preserves insertion order
	        Map<Character, Integer> countMap = new LinkedHashMap<>();
	        for (char c : str.toCharArray()) {
	        		System.out.println(c+":"+countMap.getOrDefault(c, 0) + 1);
	            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
	        }

	        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }
	        return null;
	    }

}
