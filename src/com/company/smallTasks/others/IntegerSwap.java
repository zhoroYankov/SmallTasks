package com.company.smallTasks.others;

public class IntegerSwap {
    public static void main(String[] args) {

        int a = 5;
        int b = 15;
        System.out.printf("Numbers before swap are: %d and %d%n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("Numbers after swap are: %d and %d", a, b);
    }
}
