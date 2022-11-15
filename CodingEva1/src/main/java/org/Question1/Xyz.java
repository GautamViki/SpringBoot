package org.Question1;

public class Xyz {
    private Abc abc;
    //constructor injection point
    public Xyz(Abc abc) {
        this.abc = abc;
    }

    public void showXyz() {
        System.out.println("inside showXyz of Xyz");
        System.out.println(abc);
    }
}
