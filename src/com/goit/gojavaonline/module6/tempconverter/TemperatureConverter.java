package com.goit.gojavaonline.module6.tempconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * преобразование температуры по шкале Цельсия в Форенгейта и наоборот
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        int choser = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert Temperature Celsius to Fahrenheit");
        System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
        try {
            final int selector = scanner.nextInt();
            choser += selector;
        } catch (InputMismatchException e) {
            System.out.println("Method selector must be a integer number!");
            return;
        }
        switch (choser) {
            case 1:
                System.out.println("Enter temperature in Celsius:");
                double celsius1 = scanner.nextDouble();
                double fahrenheit1 = celsius1 * 1.8 + 32;
                System.out.println(celsius1 + " celsius degree equal to " + fahrenheit1 + " fahrenheit degree");
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheit2 = scanner.nextDouble();
                double celsius2 = (fahrenheit2 - 32) / 1.8;
                System.out.println(fahrenheit2 + " fahrenheit degree equal to " + celsius2 + " celsius degree");
                break;
            default:
                System.out.println("Choose right method and try again!");
                break;
        }
    }
}
