package com.company.smallTasks.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class FeaturedProduct {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        int basketSize = scanner.nextInt();

        String products[] = new String[basketSize + 1];
        for (int i = 0; i < products.length; i++) {
            products[i] = scanner.next();
        }
        Arrays.sort(products);


        String featuredProduct = "";
        int featuredProductQuantity = 0;

        for (int i = 1; i < products.length; i++) {
            int quantity = 0;

            for (int j = i - 1; j < products.length; j++) {
                if (products[j].equals(products[i])) {
                    quantity++;
                }
            }

            if (quantity > featuredProductQuantity) {
                featuredProductQuantity = quantity;
                featuredProduct = products[i];
            } else if (quantity == featuredProductQuantity) {
                boolean isLater = products[i].compareTo(featuredProduct) > 0;
                if (isLater) {
                    featuredProduct = products[i];
                }
            }
        }
        System.out.println(featuredProduct);
    }

}


