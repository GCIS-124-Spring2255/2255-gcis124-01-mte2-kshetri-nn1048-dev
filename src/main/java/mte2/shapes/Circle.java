// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;

//public class Circle {
public class Circle implements Shape {
    
    private final double radius;
    public Circle(double radius) {    this.radius = radius;    }

    @Override
    public double perimeter() {
        return ((2*3.14)*(radius));
    }
    @Override
    public double area() {
        return ((3.14)*(radius*radius));
    }

    public static void main(String[] args) {
        Shape circle = new Circle(6);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
    }
}