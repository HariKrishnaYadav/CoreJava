package cmo.hky.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class seperateEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        seperateEvenAndOdd(listOfIntegers );

    }

  private static void seperateEvenAndOdd(List<Integer> listOfIntegers) {
        listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0)).forEach((k,v)->{
            if(k){
                System.out.println("Even numbers: "+v);
            }else {
                System.out.println("Odd numbers: "+v);
            }
        });

    }
}
