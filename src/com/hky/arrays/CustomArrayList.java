package com.hky.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }

    }

    public static void main(String[] args) {
        CustomArrayList c = new CustomArrayList();
        c.add(1);
        c.add(1);
        c.add(1);
        c.add(1);
        c.add(1);
        c.add(2);
        System.out.println(c);
        Set set=new HashSet();
        set.add(3);


    }
}
