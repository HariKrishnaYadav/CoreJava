package cmo.hky.java8.practice.concretepage;

public class TestMultiply {
    public static void main(String[] args) {
        Multipply multipply=( a, b)->a*b;
        System.out.println(multipply.multiply(4,5));
        Multipply test1=Test::test;
        Multipply.m1();
        TestStatic s=new TestStatic();
        s.multiply(10,90);

    }

}
class  Test {
    public static int test(int a, int b) {
        System.out.println("test");
        return 6+7;
    }
}

