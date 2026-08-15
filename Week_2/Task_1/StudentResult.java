import java.util.Scanner;


public class StudentResult {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Result");
        System.out.println("--------------");
        System.out.println();
        System.out.print("Enter Student Name : ");
        String name=sc.nextLine();
        System.out.println();
        System.out.println("Marks");
        System.out.println("-----");
        System.out.print("Subject 1 : ");
        int S1=sc.nextInt();
        System.out.print("Subject 2 : ");
        int S2=sc.nextInt();
        System.out.print("Subject 3 : ");
        int S3=sc.nextInt();
        System.out.println();
        System.out.println("Result");
        System.out.println("------");
        System.out.println("Total Marks : "+(S1+S2+S3));
        float Percentage=(S1+S2+S3)/3.0f;
        System.out.printf("Percentage : %.2f%%",Percentage);
        System.out.println();
        System.out.print("Grade : ");
        if(Percentage>=90)
            System.out.println("A+");
        else if(Percentage>=80)
            System.out.println("A");
        else if(Percentage>=70)
            System.out.println("B");
        else if (Percentage>=60) 
            System.out.println("C");
        else if (Percentage>=50) 
            System.out.println("D");
        else
            System.out.println("F");
        
        System.out.print("Result : ");
        if(Percentage>=50)
            System.out.print("Pass");
        else
            System.out.print("Fail");
        
    }
}
