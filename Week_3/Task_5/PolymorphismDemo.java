class Calculator {

    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

class Vehicle {

    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Polymorphism");
        System.out.println("------------");
        System.out.println();

        System.out.println("Method Overloading");
        System.out.println("------------------");

        System.out.println("calculate(int, int) : "
                + calculator.calculate(10, 20));

        System.out.println("calculate(double, double) : "
                + calculator.calculate(15.5, 20.0));

        System.out.println("calculate(int, int, int) : "
                + calculator.calculate(10, 20, 30));

        System.out.println();

        System.out.println("Method Overriding");
        System.out.println("-----------------");

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car:");
        car.start();

        System.out.println("Bike:");
        bike.start();
    }
}