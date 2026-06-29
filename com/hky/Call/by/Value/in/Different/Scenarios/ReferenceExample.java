package com.hky.Call.by.Value.in.Different.Scenarios;

public class ReferenceExample {
    public static void modifyObject(MyObject obj) {
        obj.value = 42; // Modifies the object's state
    }

    public static void main(String[] args) {
        MyObject myObj = new MyObject();
        myObj.value = 10;
        modifyObject(myObj);
        System.out.println(myObj.value); // Output: 42
    }
}

//Java Reference Types (Objects):
//When an object reference is passed, the method gets a copy of the reference. The method can modify the object’s state but cannot change the reference to point to some other object.
//
//Explanation:The method receives a copy of the reference to `myObj`. Changes to the object’s state (e.g., setting `value = 42`) are visible outside the method.