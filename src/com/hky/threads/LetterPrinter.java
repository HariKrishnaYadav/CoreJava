package com.hky.threads;

public class LetterPrinter extends Thread {


    public void run() {
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println("Thread-2:" + letter);
        }
    }

}
