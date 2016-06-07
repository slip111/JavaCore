package com.goit.gojavaonline.module4.shapearea;

public class Circle implements ShapeArea{
    private double radius;
    public Circle(double r){
        this.radius = r;
    }
    public void calculate(){
        System.out.println("CIRCLE area calculation");
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
