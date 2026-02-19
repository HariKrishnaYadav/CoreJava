package cmo.hky.java8code.arrays;



import java.util.Arrays;
import java.util.List;

public class Sort0s1s2sAnd3sTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 1, 3, 1, 0, 1, 3, 2, 1, 4,2,4, 0, 3, 0, 0, 1);

        sortAscending(list);

        System.out.println(list);

    }

    private static void sortAscending(List<Integer> list) {

        int[] count = new int[5]; // index 0,1,2,3

        // Count frequency
        for (int num : list) {
            count[num]++;
        }

        // Replace values
        int index = 0;

// We initialize an array `count` of size 5 to keep track of the frequency

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {

                list.set(index++, i);

                count[i]--;

            }
        }
    }
}

