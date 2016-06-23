package com.goit.gojavaonline.module6.workwitharrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int[] array;
        int i, j;
        int arraysize = 0;
        try {
            int arrsize = scanner.nextInt();
            arraysize += arrsize;
        }
        catch (InputMismatchException e) {
            System.out.println("Array size must be a integer number!");
            return;
        }
        try {
            array = new int[arraysize];
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Array size must be a positive integer number!");
            return;
        }
        if (arraysize != 0) {
        for (i = 0; i < arraysize; i++) {
            array[i] = (int) (Math.random() * 100);
        }
            System.out.println("Array was filled by random integer numbers up to 100:");
            for (i = 0; i < arraysize; i++)
                System.out.print(" " + array[i]);
            System.out.println();
            for (i = 0; i < arraysize; ++i) {
                int sort = array[i];
                j = i;
                while (j > 0 && sort < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = sort;
            }
            System.out.println("-----------------");
            System.out.println("Insertion Sorting");
            System.out.println("-----------------");
            System.out.println("Sorted array: ");
            for (i = 0; i < arraysize; i++)
                System.out.print(" " + array[i]);
            System.out.println();
        }
        else {
            System.out.println("Array size can't be a null!");
        }
    }
}
