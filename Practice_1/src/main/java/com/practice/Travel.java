package com.practice;

public class Travel {
    Vehicle v;
    String name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setV(Vehicle v) {
//        this.v = v;
//    }

    public Travel(Vehicle v, String name) {
        this.v = v;
        this.name = name;
    }

    public void journey() {
        v.go();
        System.out.println("Journey started........");
        System.out.println("Name is : " + name);
    }
}
