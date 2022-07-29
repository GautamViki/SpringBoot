package org.masai;

public class DrawShape {
    Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShapes(){
        System.out.println();
        System.out.println("Drawing start........");
        System.out.println();
        shape.draw();
        System.out.println();
        System.out.println("Drawing finish...........");
    }
}
