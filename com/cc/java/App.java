package com.cc.java;

public class App {
    
    public static void main(String[] args) {
Rectangle rectangle=new Rectangle(5, 10);
System.out.println("Fläche Rechteck: " + rectangle.area());
Circle circle=new Circle(25);
System.out.println("Fläche Kreis: "+ circle.area());
Triangle triangle= new Triangle(3, 15);
System.out.println("Fläche Dreieck: "+ triangle.area());
output("------  Differenzen ------");
output("Diff. r-t: " + areaDiff(rectangle, triangle));
output("------  Differenzen ------");
output("Diff. r-t: " + areaDiff(rectangle, circle)); 
output("------  Differenzen ------");
output("Diff. t-t: " + areaDiff(triangle, triangle)); 
    }

    private static double areaDiff(Shape s1, Shape s2) {

        return s1.area() - s2.area();
     }

    // private static double areaDiff(Rectangle r, Triangle t) {

    //     return r.area() - t.area();
    //  }

    //  private static double areaDiff(Rectangle r, Circle c) {

    //     return r.area() - c.area();
    //  }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

