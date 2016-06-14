package com.goit.gojavaonline.module5;

import java.util.Scanner;

public class MinMaxArray {
    public static void main (String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter array size:");
        int arraysize = scanner.nextInt();
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
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Insertion Sorting");
        System.out.println("-----------------");
        for (i=0; i<arraysize; ++i) {
            int sort = array[i];
            j = i;
            while (j > 0 && sort < array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = sort;
        }
        System.out.println("Sorted array: ");
        for (i = 0; i<arraysize; i++)
            System.out.print(" " +array[i]);
        System.out.println();
    }
}
