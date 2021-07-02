package com.company.smallTasks.hackerrank;

import java.util.Scanner;

public class MaximumSubstring {

    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String input = scanner.next();

        String max = "";
        for (int i = 0; i < input.length(); i++) {
            if (max.compareTo(input.substring(i)) <= 0) {
                max = input.substring(i);
            }
        }
        System.out.println(max);
    }
}
