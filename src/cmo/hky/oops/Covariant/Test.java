package cmo.hky.oops.Covariant;

class A {
    A method() {
        System.out.println("A method");
        return this;
    }
}

class B {
    B method() {
        System.out.println("B method");
        return this;
    }
}
//Parent return type → A
//Child return type → B
public class Test {
    public static void main(String[] args) {
        //A obj = new B();
        //obj.method();
    }
}