package org.dependency.reference;

public class B {
    private Integer y;

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
