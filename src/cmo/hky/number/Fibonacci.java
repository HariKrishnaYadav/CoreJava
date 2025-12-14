package cmo.hky.number;

public class Fibonacci {
    public static void main(String[] args) {
         int limt=10;
         int first=0;
         int second=1;
         int next;
         for(var i=1;i<=limt;i++){
             System.out.print(first+" ");
             next=first+second;
             first=second;
             second=next;
         }
    }
}
