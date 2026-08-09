package Week_1.Task_5;

public class TypeCasting {
    public static void main(String[] args) {
        int num1=25;
        double num2=25.75;
        System.out.println("Type Casting");
        System.out.println("------------");
        System.out.println();
        System.out.println("Original Values");
        System.out.println("---------------");
        System.out.println("Integer  : "+num1);
        System.out.println("Double   : "+num2);
        System.out.println();
        System.out.println("Implicit Type Casting");
        System.out.println("---------------------");
        double mydouble=num1;
        System.out.println("Integer to Double  : "+mydouble);
        System.out.println();
        System.out.println("Explicit Type Casting");
        System.out.println("---------------------");
        int myint=(int)num2;
        System.out.println("Double to Integer  : "+myint);
        System.out.println();
        

    }
    
}
