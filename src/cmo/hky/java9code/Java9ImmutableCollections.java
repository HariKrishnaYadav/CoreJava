package cmo.hky.java9code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Java9ImmutableCollections {
    public static void main(String[] args) {


    List<String> sportList = new ArrayList<String>();

        sportList.add("Hockey");
        sportList.add("Cricket");
        sportList.add("Tennis");

    List<String> unModifiableSportList = Collections.unmodifiableList(sportList);

        System.out.println(sportList);    //Output : [Hockey, Cricket, Tennis]

        System.out.println(unModifiableSportList);    //Output : [Hockey, Cricket, Tennis]

        //unModifiableSportList.add("Wrestling");     //It gives run-time error

        sportList.add("Kabaddi");      //It gives no error and will be reflected in unModifiableSportList

        System.out.println(sportList);    //Output : [Hockey, Cricket, Tennis, Kabaddi]

        System.out.println(unModifiableSportList);    //Output : [Hockey, Cricket, Tennis, Kabaddi]
        IntStream.of(1, 10, 100, 1000, 10000, 1000, 100, 10, 1, 0, 10000)
                .takeWhile(i -> i < 5000)
                .forEach(System.out::println);
        System.out.println("-----------------------------");
        IntStream.of(1, 10, 100, 1000, 10000, 1000, 100, 10, 1, 0, 10000)
                .dropWhile(i -> i < 5000)
                .forEach(System.out::println);
}
}

