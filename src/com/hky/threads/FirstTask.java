package com.hky.threads;

import java.util.concurrent.TimeUnit;

public class FirstTask extends  Thread {
    private static  int count=0;
    private int id;
    public  void run(){
       for(int i=0;i<10;i++){
           System.out.println("id:"+id+"->"+"TIK TOK :"+i);
           try {
               TimeUnit.MILLISECONDS.sleep(3000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

    }
    public  FirstTask(){
        this.id=++count;
        //this.start();
    }
}
