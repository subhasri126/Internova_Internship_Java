abstract class Shape {

    abstract void calculateArea();

    void displayMessage() {
        System.out.println("Calculating area of the shape...");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area : " + area);
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area : " + area);
    }
}

public class ShapeCalculator {

    public static void main(String[] args) {

        Shape circle = new Circle(5);

        System.out.println("CIRCLE");
        System.out.println("------");
        circle.displayMessage();
        circle.calculateArea();

        System.out.println();

        Shape rectangle = new Rectangle(10, 5);

        System.out.println("RECTANGLE");
        System.out.println("---------");
        rectangle.displayMessage();
        rectangle.calculateArea();
    }
}