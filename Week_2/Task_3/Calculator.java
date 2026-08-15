import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator ca=new Calculator();
        System.out.println("Method Calculator");
        System.out.println("-----------------");
        System.out.println();
        System.out.print("Enter first Number  : ");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=sc.nextInt();
        System.out.println();
        System.out.println("Results");
        System.out.println("-------");
        int c=ca.add(num1,num2);
        System.out.println("Addition          : "+c);
        System.out.print("Subtraction       : ");
        ca.sub(num1,num2);
        System.out.print("Multiplication    : ");
        ca.mul(num1,num2);
        float d=ca.div(num1,num2);      
        System.out.printf("Division          : %.2f",d);
        System.out.println();
        System.out.print("Modulus           : ");
        ca.mod(num1,num2);
    

   }
   int add(int a,int b){
    return a+b;
   } 
   void sub(int a,int b){
    System.out.println(a-b);
   }
   void mul(int a,int b){
    System.out.println(a*b);
   }
   float div(float a,float b){
    if(b==0){
        System.out.println("Divisor Cannot be zero");
        return 0.0f;
    }
    
    float c= a/b;
    return c;
   }
   void mod(int a,int b){
     if(b==0){
        System.out.println("Divisor Cannot be zero");
        return;
    }
    System.out.println(a%b);
   }
}
