package org.dependency.reference;

public class A {
    private Integer x;
    private B b;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", b=" + b +
                '}';
    }
}
