package com.company.smallTasks.hackerrank;

import java.util.Scanner;

public class StringCompression {

    public static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String input = scanner.next();

        String compressed = "";

        for (int i = 0; i < input.length(); i++) {

            if (i > 0 && input.charAt(i) != input.charAt(i - 1)) {
                int counter = 1;
                char current = input.charAt(i);
                for (int j = i + 1; j < input.length(); j++) {
                    if (input.charAt(j) == current) {
                        counter++;
                    } else {
                        break;
                    }
                }

                if (counter == 1) {
                    compressed += current;
                } else {
                    String count = Integer.toString(counter);
                    compressed += current + count;
                }

            } else if (i == 0) {
                compressed += input.charAt(0);
            }
        }
        System.out.println(compressed);
    }
}
