package com.goit.gojavaonline.module4.shapearea;

public class Triangle implements ShapeArea {
    private double base;
    private double height;
    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }
    public void calculate(){
        System.out.println("TRIANGLE area calculation");
    }

    public double getArea() {
        return this.base*this.height/2;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeigth() {
        return this.height;
    }
}
