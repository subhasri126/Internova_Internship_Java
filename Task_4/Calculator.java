package Week_1.Task_4;
import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("----------");
        System.out.println();
        System.out.print("Enter first Number   : ");
        int num1=sc.nextInt();
        System.out.print("Enter second number  : ");
        int num2=sc.nextInt();
        System.out.println();
        System.out.println("Results");
        System.out.println("-------");
        System.out.println();
        System.out.println("Addition             : "+(num1+num2));
        System.out.println("Subtraction          : "+(num1-num2));
        System.out.println("Multiplication       : "+(num1*num2));
        System.out.print("Division             : ");
        if(num2==0){
            System.out.print("Divisor cannot be zero");
        }else{
            System.out.print(num1/num2);
        }
        System.out.println();
        System.out.print("Modulus              : ");
        if(num2==0){
            System.out.print("Divisor cannot be zero");
        }else{
            System.out.print(num1%num2);
        }
    }
}