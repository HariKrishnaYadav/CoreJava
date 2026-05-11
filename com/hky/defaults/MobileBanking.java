package com.hky.defaults;

interface MobileBanking {

    default void transferMoney() {
        System.out.println("Money transferred using Mobile Banking");
    }
}