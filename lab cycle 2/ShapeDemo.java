package labexperiments;

import java.util.Scanner;

// Define the Shape interface
interface Shape {
    // Abstract method to calculate area
    double calculateArea();
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding calculateArea() for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Formula for the area of a triangle
    }

    @Override
    public String toString() {
        return "Triangle (base = " + base + ", height = " + height + ")";
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea() for Rectangle
    @Override
    public double calculateArea() {
        return length * width; // Formula for the area of a rectangle
    }

    @Override
    public String toString() {
        return "Rectangle (length = " + length + ", width = " + width + ")";
    }
}

// Main class to demonstrate polymorphism
public class ShapeDemo {
    public static void main(String[] args) {
        // Create Shape references for Triangle and Rectangle
        Shape triangle = new Triangle(10, 5);      // Base = 10, Height = 5
        Shape rectangle = new Rectangle(8, 4);     // Length = 8, Width = 4

        // Demonstrate polymorphism by calling calculateArea()
        System.out.println(triangle.toString());
        System.out.printf("Area of Triangle: %.2f\n", triangle.calculateArea());

        System.out.println(rectangle.toString());
        System.out.printf("Area of Rectangle: %.2f\n", rectangle.calculateArea());
    }
}
