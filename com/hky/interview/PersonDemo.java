package com.hky.interview;

public class PersonDemo {
    void methodA() {
        Person obj = new Person();
        obj.setAge(1);

        methodB(obj);

        System.out.println(obj.age);
    }

    Person methodB(Person obj) {
        obj.setAge(2);
        return obj;
    }

    public static void main(String[] args) {
        PersonDemo p = new PersonDemo();
        p.methodA();
    }
}
