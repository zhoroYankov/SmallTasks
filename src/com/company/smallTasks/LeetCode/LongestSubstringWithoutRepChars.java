package com.company.smallTasks.LeetCode;

public class LongestSubstringWithoutRepChars {
    public static void main(String[] args) {

        String string = "abcabcbb";
        int maximumSubstring = 0;

        if (string.equalsIgnoreCase("")) {
            System.out.println(maximumSubstring);
            return;
        } else {

            for (int i = 0; i < string.length(); i++) {
                int max = countMaxSubstring(string, i);
                if (max > maximumSubstring) {
                    maximumSubstring = max;
                }
            }
        }

        System.out.println(maximumSubstring);
    }


    public static int countMaxSubstring(String string, int startIndex) {
        int counter = 1;
        String toCheck = Character.toString(string.charAt(startIndex));
        String currentChar;

        for (int i = startIndex + 1; i < string.length(); i++) {
            currentChar = Character.toString(string.charAt(i));

            if (!toCheck.contains(currentChar)) {
                toCheck += currentChar;
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

}
