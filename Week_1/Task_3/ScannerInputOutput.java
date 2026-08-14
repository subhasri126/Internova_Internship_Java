package Week_1.Task_3;
import java.util.Scanner;
public class ScannerInputOutput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Information");
        System.out.println("-------------------------");
        System.out.println();
        System.out.print("Enter full Name           : ");
        String fullName=sc.nextLine();
        
        System.out.print("Enter your Age            : ");    
        int Age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your college Name   : ");
        
        String College=sc.nextLine();
        
        System.out.print("Enter your Branch         : ");
       
        String Branch=sc.nextLine();
        
        System.out.print("Enter Your city           : ");
        String City=sc.nextLine();

        System.out.println();
        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Full name       : "+fullName);
        System.out.println("Age             : "+Age);
        System.out.println("College         : "+College);
        System.out.println("Branch          : "+Branch);
        System.out.println("City            : "+City);


    }
}

