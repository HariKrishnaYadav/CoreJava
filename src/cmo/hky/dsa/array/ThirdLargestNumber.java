package cmo.hky.dsa.array;



public class ThirdLargestNumber {
    private static int findThirdLargestNumber(int[] arr) {

        if (arr.length < 3) {
            return Integer.MIN_VALUE; // No second largest number
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                thirdLargest=secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num>secondLargest) {
                thirdLargest=secondLargest;
                secondLargest=num;
             } else if (num>thirdLargest && num!=secondLargest) {
                thirdLargest=num;
            }
        }

        return thirdLargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int thirdLargest = findThirdLargestNumber(arr);
        if (thirdLargest != Integer.MIN_VALUE) {
            System.out.println("The Third largest number is: " + thirdLargest);
        } else {
            System.out.println("There is no third largest number in the array.");
        }
    }


}
