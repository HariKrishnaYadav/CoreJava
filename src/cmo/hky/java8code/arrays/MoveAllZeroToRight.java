package cmo.hky.java8code.arrays;

public class MoveAllZeroToRight {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void pushZerosToEnd(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {

            arr[count++] = 0;
        }
    }
}