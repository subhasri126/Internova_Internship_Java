package Week_1.Task_6;
import java.util.Scanner;
public class Javafundamentals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Values");
        System.out.println("------------");
        System.out.println();
        System.out.print("Integer  : ");
        int intnum=sc.nextInt();
        System.out.print("Float    : ");
        float floatnum=sc.nextFloat();
        System.out.print("Double   : ");
        double doublenum=sc.nextDouble();
        System.out.println();
        System.out.println("Original Values");
        System.out.println("---------------");
        System.out.println();
        System.out.println("Integer  : "+intnum);
        System.out.println("Float    : "+floatnum);
        System.out.println("Double   : "+doublenum);
        System.out.println();
        System.out.println("Implicit Type Casting");
        System.out.println("---------------------");
        System.out.println();
        float myFloat=intnum;
        System.out.println("Integer to float  : "+myFloat);
        double myDouble=floatnum;
        System.out.println("Float to Double   : "+myDouble);
        System.out.println();
        System.out.println("Explicit Type Casting");
        System.out.println("---------------------");
        System.out.println();
        int myint=(int)floatnum;
        System.out.println("Float to Integer   : "+myint);
        int myint2=(int)doublenum;
        System.out.println("Double to Integer  : "+myint2);
    }
}
