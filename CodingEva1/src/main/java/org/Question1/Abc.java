package org.Question1;

public class Abc {
    private Xyz xyz;
    //setter injection point
    public void setXyz(Xyz xyz) {
        this.xyz = xyz;
    }

    public void showAbc() {
        System.out.println("inside showAbc of Abc ");
        System.out.println(xyz);
    }
}
