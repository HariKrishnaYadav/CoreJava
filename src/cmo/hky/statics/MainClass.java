package cmo.hky.statics;

public class MainClass {

    static
    {
        System.out.println("MainClass SIB");
    }
    public static void main(String[] args) {

        //Static Members directly accessed with Class Name
        StaticComponents.staticVariable = 20;
        StaticComponents.staticMethod();

    }
}
