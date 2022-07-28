package com.practice;

public class Bike implements Vehicle{
    @Override
    public void go() {
            ride();
    }
    public void ride(){
        System.out.println("Ride start.....");
    }
}
