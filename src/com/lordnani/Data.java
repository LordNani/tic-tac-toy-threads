package com.lordnani;

public class Data {
    private int state=0;

    public int getState() { return state; }

    public void Tic(){
        System.out.print("Tic-");

        state=1;
    }
    public  void Tak(){
        System.out.print("Tak-");
        state = 2;

    }
    public void Toy(){

        System.out.println("Toy");
        state = 0;

    }
}
