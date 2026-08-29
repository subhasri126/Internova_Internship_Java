import java.util.ArrayList;
import java.util.Scanner;

public class StudentNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter names of 5 students:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + " : ");
            students.add(sc.nextLine());
        }

        System.out.println("\n======================================");
        System.out.println("          STUDENT COLLECTION");
        System.out.println("======================================");

        System.out.println("\nAll Student Names");
        System.out.println("-----------------");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.print("\nEnter student name to remove : ");
        String removeName = sc.nextLine();

        if (students.remove(removeName)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("\nEnter student name to search : ");
        String searchName = sc.nextLine();

        if (students.contains(searchName)) {
            System.out.println("Student found.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nFinal Collection");
        System.out.println("----------------");

        for (String student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}

