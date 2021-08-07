package com.company.smallTasks.others;

import java.util.Scanner;

public class SandClockCalculation2DArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[6][6];

        for (
                int row = 0;
                row < 6; row++) {
            for (int column = 0; column < 6; column++) {
                array[row][column] = scanner.nextInt();
            }
        }
        System.out.println(maxHourglasSum(array));
    }


    public static int maxHourglasSum(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++)
            for (int column = 0; column < 4; column++) {
                int calculated = calculateSum(array, row, column);
                if (calculated > maxSum) {
                    maxSum = calculated;
                }
            }
        return maxSum;
    }

    public static int calculateSum(int[][] array, int row, int column) {
        int calculated = array[row + 0][column + 0] + array[row + 0][column + 1] + array[row + 0][column + 2] +
                                                        array[row + 1][column + 1] +
                array[row + 2][column + 0] + array[row + 2][column + 1] + array[row + 2][column + 2];
        return calculated;
    }

}
