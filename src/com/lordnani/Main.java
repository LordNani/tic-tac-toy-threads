package com.lordnani;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Data    d = new Data();

        Worker w3=new Worker(2, d);
        Worker w2=new Worker(1, d);
        Worker w1=new Worker(0, d);


        w3.join();
        w2.join();
        w1.join();



        System.out.println("end of main...");
    }
}
