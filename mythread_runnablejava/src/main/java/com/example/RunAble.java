package com.example;

public class RunAble {
    public static void main(String[] args) {
       MyRunnable r=new MyRunnable();
        new Thread(r,"��һ").start();
        new Thread(r,"�ڶ�").start();
        new Thread(r,"����").start();
    }
}
