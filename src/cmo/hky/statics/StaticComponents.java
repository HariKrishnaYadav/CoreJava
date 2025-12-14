package cmo.hky.statics;

public class StaticComponents {
    static int staticVariable;

    static
    {
        System.out.println("StaticComponents SIB");
        staticVariable = 10;
    }
    static void staticMethod()
    {
        System.out.println("From StaticMethod");
        System.out.println(staticVariable);
    }
}
