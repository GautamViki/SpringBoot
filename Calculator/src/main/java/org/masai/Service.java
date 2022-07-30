package org.masai;

public class Service implements Operation {
    private int num1;
    private int num2;

    public Service(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumOfNumber() {
        int sum = num1 + num2;
        return sum;
    }

    public int multiplication() {
        int mul = num1 * num2;
        return mul;
    }

    public int subtraction() {
        int sub = num1 - num2;
        return sub;
    }

    @Override
    public int[] getResult() {
        int sum = sumOfNumber();
        int mul = multiplication();
        int sub = subtraction();
        int[] arr = new int[3];
        arr[0] = sum;
        arr[1] = mul;
        arr[2] = sub;
        return arr;

    }
}
