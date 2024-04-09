package com.hky.basic.program;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		findDuplicate("harekrishnayadav");
	}

static void findDuplicate(String string) {
	Map<Character, Integer> countDuplicateElement=new HashMap<>();
	char[] charArray=string.toCharArray();
	    for (char c : charArray) {
	    	if(countDuplicateElement.containsKey(c)) {
	    		countDuplicateElement.put(c, countDuplicateElement.get(c)+1);
	    	}else {
	    		countDuplicateElement.put(c, 1);
	    	}
			
		}
	    for (Map.Entry<Character, Integer> entry : countDuplicateElement.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("element--->"+entry.getKey()+"="+entry.getValue());
			}
			
		}
		
	}

}
