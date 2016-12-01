package com.example;

public class F extends Thread {
    String name;
    private int ticket = 10;
    public F( String name ) {
        this.name=name;
    }

    public static void main(String[] args) {
        F f=new F("Ò»ºÅ______");
        F f1=new F("¶þºÅ_____");
        F f3=new F("ÈýºÅ_____");
        f.start();;
        f1.start();
        f3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket>0){
                System.out.println(Thread.currentThread().getName()+"ÂôÆ±------>"+(this.ticket--));
            }
        }
    }
}