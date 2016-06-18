package com.goit.gojavaonline.module6;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MinMaxArray {
    public static void main (String[] args) {
        final Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter array size:");
        final int arraysize = scanner.nextInt();
        int[] array;
        int i, j;
        array = new int[arraysize];
        System.out.println("Array was filled by random integer numbers up to 100:");
        for(i=0; i < arraysize; i++) {
            array[i] = (int)(Math.random()*100);
        }

        for(i=0; i < arraysize; i++)
            System.out.print(" " +array[i]);
            System.out.println();
        int max=array[0];
        int min = 100;
        for(i=1; i < arraysize; i++) {
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
        System.out.println("Max array item is: " +max);
        System.out.println("Min array item is: " +min);

    }
}
