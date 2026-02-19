package cmo.hky.java9code;

public class InterfaceTest implements InterfaceDemo {

    @Override
    public void abstractMethodOne() {
        System.out.println("I am abstract method one!!!");
    }

    @Override
    public void abstractMethodTwo() {
        System.out.println("I am abstract method two!!!");
    }

    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        interfaceTest.abstractMethodOne();
        interfaceTest.abstractMethodTwo();
        interfaceTest.defaultMethod();
        InterfaceDemo.staticMethod();
    }


}
