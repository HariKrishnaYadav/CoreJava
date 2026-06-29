package bin.com.hky.splits;

public class SplitUseCase {
    public static void main(String[] args) {

        String str = "www.google.com";
        String[] arr = str.split("\\.");

        for(String s : arr) {
            System.out.println(s);
        }
        System.out.println("------------");
                String str1 = "Java Spring Boot";
                String[] words = str1.split(" ");

                for(String word : words) {
                    System.out.println(word);
                }

        System.out.println("---------");
        String data = "Apple,Banana,Mango";
        String[] fruits = data.split(",");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("---Split by Multiple Delimiters----");

        String str2 = "Java,Spring;Boot";
        String[] arr1 = str2.split("[,;]");

        for(String s : arr1) {
            System.out.println(s);
        }
        System.out.println("----");


        String sentence = "I love Java";
        int count = sentence.split("\\s+").length;

        System.out.println(count);

        }
    }

