package com.practice1;

public class A {
    private B b;

//    public A(B b) {
//        this.b = b;
//    }

    public void setB(B b) {
        this.b = b;
    }

    public void funA() {
        System.out.println("Inside funA of A");
        System.out.println(b);
    }
}
