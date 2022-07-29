package org.masai;

public class Circle implements Shape{
    @Override
    public void draw() {
        drawCircle();
    }
    public void drawCircle(){
        System.out.println("Circle drawn.......");
    }
}
