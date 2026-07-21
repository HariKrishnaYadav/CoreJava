package com.hky.interview.java8.basic;

import java.util.stream.IntStream;

public class MultiplyAternativeNumber {
    static void main(String[] args) {
        int[]  numb={4,3,1,6,7,8,9,10};
     int   res=IntStream.range(0,numb.length).filter(x->x%2==0)
             .map(x->numb[x]).reduce(1,(a,b)->a*b);
        System.out.println(res);

        IntStream.range(0,numb.length/2).map(x->numb[x]*numb[numb.length-x-1]).forEach(System.out::println);
    }

}
