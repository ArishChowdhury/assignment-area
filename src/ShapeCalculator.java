import java.util.Scanner;

// Circle Class
class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (circumference)
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle Class
class Rectangle {
    double length, breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area
    double area() {
        return length * breadth;
    }

    // Method to calculate the perimeter
    double perimeter() {
        return 2 * (length + breadth);
    }
}

// Triangle Class
class Triangle {
    double side_A, side_B, side_C;

    // Constructor
    Triangle(double side_A, double side_B, double side_C) {
        this.side_A = side_A;
        this.side_B = side_B;
        this.side_C = side_C;
    }

    // Method to calculate the area using Heron's formula
    double area() {
        double s = (side_A + side_B + side_C) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side_A) * (s - side_B) * (s - side_C));
    }

    // Method to calculate the perimeter
    double perimeter() {
        return side_A + side_B + side_C;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input and calculations for Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        // Input and calculations for Rectangle
        System.out.print("\nEnter the length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        // Input and calculations for Triangle
        System.out.print("\nEnter the three sides of the triangle: ");
        double side_A = sc.nextDouble();
        double side_B = sc.nextDouble();
        double side_C = sc.nextDouble();
        Triangle triangle = new Triangle(side_A, side_B, side_C);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        sc.close();
    }
}