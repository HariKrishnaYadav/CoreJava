package cmo.hky.oops;

public class BaseClass {
    public A m1() {
        System.out.println("In BaseClass method");
        return new A();
    }

    public static void main(String args[])
    {
        BaseClass b=new SubClass();
        b.m1();
    }
}

class SubClass extends BaseClass {
    public B m1() {
        System.out.println("In SubClass method");
        return new B();

    }
}






