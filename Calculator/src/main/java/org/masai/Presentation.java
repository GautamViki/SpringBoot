package org.masai;

public class Presentation {
    Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void result(){
        int []arr=operation.getResult();
        System.out.println("===================================");
        System.out.println("Sum of both number : "+arr[0]);
        System.out.println("Difference of both number : "+arr[2]);
        System.out.println("Multiplication of both number : "+arr[1]);
        System.out.println("===================================");
    }
}
