package com.goit.gojavaonline.module4.dotsdistance;

import java.util.Scanner;
/**
 * Создать класс вычисляющий расстояние м-у двумя точками, представленными координатами в
 * двумерном массиве
 */
public class DotsDistance {
    public static void main (String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Count distance between two points");
        System.out.println("Enter X coordinate of point A");
        final double x1= scanner.nextDouble();
        System.out.println("Enter Y coordinate of point A");
        final double y1= scanner.nextDouble();

        System.out.println("Enter X coordinate of point B");
        final double x2= scanner.nextDouble();
        System.out.println("Enter Y coordinate of point B");
        final double y2= scanner.nextDouble();
        double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Distance between A and B points is " +distance);
    }


}
