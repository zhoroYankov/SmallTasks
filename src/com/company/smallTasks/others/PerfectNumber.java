package com.company.smallTasks.others;

public class PerfectNumber {

    public static void main(String[] args) {
        // first first N perfect numbers

        int count = 0;
        int number = 10000;

            for (int n = 2; n < number; n++) {
                if (isPerfect(n)) {
                    System.out.println(n);
                    count++;
                }
            }


    }

    public static boolean isPerfect(int number) {
        int sum = 1;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                if (i * i != number)
                    sum += i + number / i;
                else
                    sum += i;
            }
        }


        if (sum == number && number != 1) {
            return true;
        }
        return false;
    }
}
