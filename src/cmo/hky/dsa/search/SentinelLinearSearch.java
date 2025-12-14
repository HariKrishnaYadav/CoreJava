package cmo.hky.dsa.search;

public class SentinelLinearSearch {
    public static int sentinelSearch(int[] arr, int key) {
        int n = arr.length;
        int last = arr[n - 1];
        arr[n - 1] = key; // Set the sentinel

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last; // Restore original value

        if (i < n - 1 || arr[n - 1] == key)
            return i; // Found
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 13, 15, -1}; // Extra space for sentinel
        int key = 11;

        int index = sentinelSearch(arr, key);
        if (index != -1)
            System.out.println("Key found at index: " + index);
        else
            System.out.println("Key not found");
    }
}

