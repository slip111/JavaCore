package com.goit.gojavaonline.module6.workwitharrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxArray {
    public static void main (String[] args) {
        final Scanner scanner  = new Scanner(System.in);
        int[] array;
        int i, min, max, arraysize;
        arraysize = 0;
            System.out.println("Enter array size:");
        try {
            final int arrsize = scanner.nextInt();
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
        for (i = 0; i < arraysize; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        try {
            max = array[0];
            min = 100;
            System.out.println("Array was filled by random integer numbers up to 100:");
            for (i = 0; i < arraysize; i++)
                System.out.print(" " + array[i]);
            System.out.println();
            for (i =1; i < arraysize; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println();
            System.out.println("----------------------");
            System.out.println("Min Max items in array");
            System.out.println("----------------------");
            System.out.println("Max array item is: " + max);
            System.out.println("Min array item is: " + min);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size can't be a null!");
        }
    }
}
