package com.company.smallTasks.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReduction {

    public static Scanner scanner;

    public static void main(String[] args) {
        /*There si an array of 'n' integers called 'num'. The array can be reduced by 1 element by performing a move.
         * Each move consists of the following three steps:
         * 1. Pick 2 different elements num[i] and num[j], i!=j.
         * 2. Remove the 2 selected elements from the array.
         * 3. Add the sum of the  selected elements to the end of the array.
         * Each move has a cost associated with it: the sum of the two elements removed from the array during the move.
         * Calculate the minimum cost of reducing the array to one element.*/

        scanner = new Scanner(System.in);

        System.out.print("Write array size(2-4000): ");
        int n = scanner.nextInt();
        int[] num = new int[n];

        insertNumbersInArray(num);

        System.out.println("Total cost is: " +totalCost(num));


    }


    public static void insertNumbersInArray(int[] num) {

        for (int i = 0; i < num.length; i++) {
            System.out.print("Insert a number: ");
            int currentNum = scanner.nextInt();
            num[i] = currentNum;
            if (i == num.length - 1) {
                System.out.println("No more numbers to add!");
            }
        }
    }


    public static int totalCost(int[] num){
        int cost = 0;
        for (int i=1; i<num.length; i++) {
            num[i] += num[i-1];
            cost += num[i];
        }
        return cost;
    }

}
