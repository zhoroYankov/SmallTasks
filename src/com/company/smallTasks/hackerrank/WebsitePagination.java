package com.company.smallTasks.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WebsitePagination {

    public static Scanner scanner;

    public static void main(String[] args) {
        /*There will be a list of items in the form of 2D String array where each element contains[name, relevance, price].
         * Given the sort column, the sort order (0-ascending or 1-descending), the number of items to be displayed on each page,
         * and a page number, determine the list of item names in the specified page while respecting the items order.
         * Page numbering starts at 0 */


        scanner = new Scanner(System.in);
        System.out.println("Write number of items");
        int numberOfItems = scanner.nextInt();


        String[][] items = new String[numberOfItems][3];
        int relevance = 0;
        int price = 0;

        int sortParameter = 0;
        int sortOrder = 0;
        int itemsPerPage = 0;
        int pageNumber = 0;

        String[] itemsByParameter = new String[numberOfItems];

        fillFirstArray(numberOfItems, items, relevance, price);


        System.out.print("Write sort parameter(0-name, 1-relevance or 2-price): ");
        sortParameter = scanner.nextInt();

        createSecondArray(sortParameter, items, itemsByParameter);


        System.out.print("Write sort order(0-ascending or 1-descending): ");
        sortOrder = scanner.nextInt();

        sortSecondArray(sortOrder, itemsByParameter);


        System.out.println("Write items per page(1-20): ");
        itemsPerPage = scanner.nextInt();

        System.out.print("Write page number(starts from 0): ");
        pageNumber = scanner.nextInt();


        showInfo(itemsByParameter, itemsPerPage, pageNumber);


    }


    public static void fillFirstArray(int numberOfItems, String[][] items, int relevance, int price) {

        for (int i = 0; i < numberOfItems; i++) {

            System.out.printf("Write name of item %d: ", i + 1);
            items[i][0] = scanner.next();
            System.out.printf("Write relevance of item %d: ", i + 1);
            relevance = scanner.nextInt();
            items[i][1] = Integer.toString(relevance);
            System.out.printf("Write price if item %d: ", i + 1);
            price = scanner.nextInt();
            items[i][2] = Integer.toString(price);

            if (i == numberOfItems - 1) {
                System.out.printf("No more items ot add !");
            }
        }
    }


    public static void createSecondArray(int sortParameter, String[][] items, String[] itemsByParameter) {

        if (sortParameter == 0) {
            for (int i = 0; i < items.length; i++) {
                String itemName = items[i][0];
                itemsByParameter[i] = itemName;
            }

        } else if (sortParameter == 1) {
            for (int i = 0; i < items.length; i++) {
                String itemRelevance = items[i][1];
                itemsByParameter[i] = itemRelevance;
            }

        } else if (sortParameter == 2) {
            for (int i = 0; i < items.length; i++) {
                String itemPrice = items[i][2];
                itemsByParameter[i] = itemPrice;
            }
        }
    }


    public static void sortSecondArray(int sortOrder, String[] itemsByParameter) {

        if (sortOrder == 0) {
            Arrays.sort(itemsByParameter);

        } else if (sortOrder == 1) {
            Arrays.sort(itemsByParameter, Collections.<String>reverseOrder());
        }
    }


    public static void showInfo(String[] itemsByParameter, int itemsPerPage, int pageNumber) {

        if (itemsByParameter.length < itemsPerPage) {
            for (int i = 0; i < itemsByParameter.length; i++) {
                System.out.println(itemsByParameter[i]);
            }
        } else {
            for (int i = 0; i < itemsPerPage; i++) {
                int element = (pageNumber * itemsPerPage) + i;
                System.out.println(itemsByParameter[element]);
            }
        }
    }


}
