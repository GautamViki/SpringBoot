package com.practice1;

public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
    public void funB(){
        System.out.println("Inside funB of B");
        System.out.println(a);
    }
}
