package com.hky.basic.program;

import java.util.Arrays;

public class AnagramChecker {
	public static void main(String[] args) {
		 String str1 = "listen";
	        String str2 = "silent";
		if(areAnagrams(str1,str2)) {
			System.out.println(str1+ " and " +str2+" are anagram.");
		}else {
			System.out.println(str1+ " and " +str2+" are not anagram.");
		}
	}

	private static boolean areAnagrams(String str1,String str2) {
		 str1=str1.replaceAll("\\s", " ").toLowerCase();
		 str2=str2.replaceAll("\\s", " ").toLowerCase();
		 Boolean status=false;
		 if(str1.length()!=str2.length())
			 return status;
		 
			 char[] charArray1=str1.toCharArray();
			 char[] charArray2=str2.toCharArray();
			 
			  Arrays.sort(charArray1);
		        Arrays.sort(charArray2);
			
		        status= Arrays.equals(charArray1, charArray2);
	
		return status;


}
}