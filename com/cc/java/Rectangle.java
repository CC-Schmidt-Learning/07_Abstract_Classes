package com.cc.java;

public class Rectangle extends Shape {

    private double a, b;

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double area() {
        return a*b;
    };


    
}
