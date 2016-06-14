package com.goit.gojavaonline.module4.shapearea;

public class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    public void calculate(){
        System.out.println("RECTANGLE area calculation");
    }

    public double getArea() {
        return this.width*this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeigth() {
        return this.height;
    }
}
