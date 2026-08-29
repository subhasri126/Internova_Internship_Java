import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number  : ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number : ");
            double num2 = sc.nextDouble();

            System.out.println("\n======================================");
            System.out.println("          CALCULATOR RESULTS");
            System.out.println("======================================");

            System.out.println("Addition       : " + (num1 + num2));
            System.out.println("Subtraction    : " + (num1 - num2));
            System.out.println("Multiplication : " + (num1 * num2));

            try {
                if (num2 == 0) {
                    throw new ArithmeticException("Divisor cannot be zero");
                }

                System.out.println("Division       : " + (num1 / num2));
                System.out.println("Modulus        : " + (num1 % num2));

            } catch (ArithmeticException e) {
                System.out.println("Division       : " + e.getMessage());
                System.out.println("Modulus        : " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("\nError: Please enter valid numeric values.");
        }

        sc.close();
    }
}

