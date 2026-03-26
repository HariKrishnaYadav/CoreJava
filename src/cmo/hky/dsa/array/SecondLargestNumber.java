package cmo.hky.dsa.array;



public class SecondLargestNumber {
    private static int findSecondLargestNumber(int[] arr) {

        if (arr.length < 2) {
            return Integer.MIN_VALUE; // No second largest number
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargestNumber(arr);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number in the array.");
        }
    }


}
