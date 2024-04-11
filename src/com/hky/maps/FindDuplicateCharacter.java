package com.hky.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter steing:::");
        String str=sc.nextLine();
        Map<Character,Integer> countDuplicate=new HashMap<>();
       for(int i=0;i<str.length();i++){
           Character ch=str.charAt(i);
           countDuplicate.computeIfPresent(ch,(Character,count)->count+1);
           countDuplicate.computeIfAbsent(ch,character -> 1);
       }
//       for(Character c:countDuplicate.keySet()){
//           if(countDuplicate.get(c)>1){
//               System.out.println("Duplecate character "+c+"======="+countDuplicate.get(c));
//           }
//       }
        //countDuplicate.forEach({k,v)->k);

    }
}
