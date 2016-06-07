package com.goit.gojavaonline.module4.tempconverter;

import java.util.Scanner;
/**
 * преобразование температуры по шкале Цельсия в Форенгейта и наоборот
 */
public class TemperatureConverter {
    public static void main (String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Convert Temperature Celsius to Fahrenheit");
        System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
        final int choser= scanner.nextInt();
        switch (choser){
            case 1:
                System.out.println("Enter temperature in Celsius:");
                double celsius1 = scanner.nextDouble();
                double fahrenheit1 = celsius1*1.8+32;
                System.out.println(celsius1 +" celsius degree equal to " +fahrenheit1 +" fahrenheit degree");
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheit2 = scanner.nextDouble();
                double celsius2 = (fahrenheit2-32)/1.8;
                System.out.println(fahrenheit2 +" fahrenheit degree equal to " +celsius2 +" celsius degree");
                break;
        }
    }


}
