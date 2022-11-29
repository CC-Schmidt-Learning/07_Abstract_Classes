package com.cc.java;

public class App {
    
    public static void main(String[] args) {
Rectangle rectangle=new Rectangle(5, 10);
System.out.println("Fläche Rechteck: " + rectangle.area());
Circle circle=new Circle(25);
System.out.println("Fläche Kreis: "+ circle.area());
Triangle triangle= new Triangle(3, 15);
System.out.println("Fläche Dreieck: "+ triangle.area()); 
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

