package com.company.smallTasks.others;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacciRec(10));
        fibonacciIter(10);
    }

    public static int fibonacciRec(int n) {
        if (n <= 1) {
            return n;
        }
        return (fibonacciRec(n - 2) + fibonacciRec(n - 1));
    }

    public static void fibonacciIter(int n) {

        int previousNumber = 0;
        int nextNumber = 1;
        System.out.print(previousNumber + " " + nextNumber + " ");


        for (int i = 1; i <= n - 1; i++) {

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            System.out.print(sum + " ");

        }
    }

}
