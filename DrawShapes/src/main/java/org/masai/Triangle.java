package org.masai;

public class Triangle implements Shape {
    @Override
    public void draw() {
        drawTriangle();
    }
    public void drawTriangle(){
        System.out.println("Triangle drawn.......");
    }
}
