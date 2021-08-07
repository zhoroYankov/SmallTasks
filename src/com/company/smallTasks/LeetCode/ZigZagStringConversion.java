package com.company.smallTasks.LeetCode;

import java.util.Arrays;

public class ZigZagStringConversion {

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int n = 3;

        zigZagStringConcat(str, n);

    }

    public static void zigZagStringConcat(String word, int rows) {

            if (rows == 1) {
                System.out.print(word);
                return;
            }

            char[] arrayOfChars = word.toCharArray();
            int length = word.length();

            String[] arr = new String[rows];
            Arrays.fill(arr, "");

            int currentRow = 0;
            boolean down = true;

            for (int i = 0; i < length; ++i) {
                arr[currentRow] += (arrayOfChars[i]);

                if (currentRow == rows - 1) {
                    down = false;
                } else if (currentRow == 0) {
                    down = true;
                }

                if (down) {
                    currentRow++;
                } else {
                    currentRow--;
                }
            }

        }


    }
