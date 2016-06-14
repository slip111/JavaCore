package com.goit.gojavaonline.module4.shapearea;


public class CalculateShapeArea {
    public static void main(String[] args){
        Shape shapeArea = new Triangle(5,8);
        shapeArea.calculate();
        System.out.println("Triangle area is: " +shapeArea.getArea() +"(square millimeters)");

        shapeArea = new Rectangle(200,30);
        shapeArea.calculate();
        System.out.println("Rectangle area is: " +shapeArea.getArea() +"(square millimeters)");

        shapeArea = new Circle(34);
        shapeArea.calculate();
        System.out.println("Circle area is: " +shapeArea.getArea() +"(square millimeters)");
    }
}
