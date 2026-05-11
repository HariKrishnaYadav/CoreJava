package com.hky.defaults;

interface InternetBanking {

    default void transferMoney() {
        System.out.println("Money transferred using Internet Banking");
    }
}