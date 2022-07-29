package org.masai;

public class Cylinder implements Shape{
    @Override
    public void draw() {
        drawCylinder();
    }

    public void drawCylinder(){
        System.out.println("Cylinder drawn.........");
    }
}
