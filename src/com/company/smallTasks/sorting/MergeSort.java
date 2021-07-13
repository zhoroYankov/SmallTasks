package com.company.smallTasks.sorting;

public class MergeSort {

    public static void main(String[] args) {

        int numbers[] = {17, 5, 1, 13, 6, 19, 8, 15, 7, 12, 9, 4, 10, 11, 16, 14, 2, 3, 18, 20};

        mergesort(numbers);

        for (Integer num : numbers){
            System.out.print(num + " ");
        }
    }

    public static void mergesort(int[] numbers) {

        mergesort(numbers, new int[numbers.length], 0, numbers.length - 1);
    }

    public static void mergesort(int[] numbers, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergesort(numbers, temp, leftStart, middle);
        mergesort(numbers, temp, middle + 1, rightEnd);
        mergeHalves(numbers, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] numbers, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (numbers[left] <= numbers[right]) {
                temp[index] = numbers[left];
                left++;
            } else {
                temp[index] = numbers[right];
                right++;
            }
            index++;
        }

        System.arraycopy(numbers, left, temp, index, leftEnd - left + 1);
        System.arraycopy(numbers, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, numbers, leftStart, size);
    }
}
