import java.util.Scanner;

public class MethodParameters {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    static float average(float a, float b, float c) {
        return (a + b + c) / 3.0f;
    }

    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for square: ");
        int n = sc.nextInt();

        System.out.print("Enter a number for cube: ");
        int num = sc.nextInt();

        System.out.print("Enter three numbers for average: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.print("Enter two numbers to find maximum: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("\n------------------------------------");
        System.out.println("         METHOD RESULTS");
        System.out.println("--------------------------------------");

        System.out.println("Square : " + square(n));
        System.out.println("Cube   : " + cube(num));
        System.out.printf("Average: %.2f%n", average(a, b, c));
        System.out.println("Maximum: " + maximum(x, y));

        sc.close();
    }
}
