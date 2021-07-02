package com.company.smallTasks.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int numbers[] = {17, 5, 1, 13, 6, 19, 8, 15, 7, 12, 9, 4, 10, 11, 16, 14, 2, 3, 18, 20};
        int swapper = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[i]) {
                    swapper = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = swapper;

                }
            }
        }

        for (int k = 0; k < numbers.length; k++) {
            System.out.println(numbers[k]);
        }
    }
}
