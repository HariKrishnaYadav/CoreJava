package com.hky.oops.test5;
//Explanation
//
//Java supports covariant return types
//
//Child method can return subclass type
//
//Improves readability & polymorphism
class Animal {
    Animal get() {
        return new Animal();
    }
}

class Dog extends Animal {
    Dog get() {
        return new Dog();
    }
}
