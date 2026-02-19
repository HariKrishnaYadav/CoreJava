package com.hky.thread;

public class DeadLockInJava {
    synchronized void  methodOne(DeadLockInJava obj){
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+" is executing methodOne");
        obj.methodTwo(this);


    }
    synchronized void  methodTwo(DeadLockInJava obj){
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+" is executing methodTwo");
        obj.methodOne(this);
    }

    public static void main(String[] args) {
        DeadLockInJava obj1=new DeadLockInJava();
        DeadLockInJava obj2=new DeadLockInJava();

        Thread thread1=new Thread(()->{
            obj1.methodOne(obj2);
        },"Thread-1");

        Thread thread2=new Thread(()->{
            obj2.methodTwo(obj1);
        },"Thread-2");

        thread1.start();
        thread2.start();
    }
}
