package com.example;

public class RunAble {
    public static void main(String[] args) {
       MyRunnable r=new MyRunnable();
        new Thread(r,"第一").start();
        new Thread(r,"第二").start();
        new Thread(r,"第三").start();
    }
}
