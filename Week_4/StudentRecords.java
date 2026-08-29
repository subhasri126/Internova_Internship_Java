import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRecords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("Enter details of 5 students:");

        for (int i = 0; i < 5; i++) {

            System.out.print("Student ID   : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Student Name : ");
            String name = sc.nextLine();

            students.put(id, name);
            System.out.println();
        }

        System.out.println("======================================");
        System.out.println("          STUDENT RECORDS");
        System.out.println("======================================");

        System.out.println("\nAll Student Records");
        System.out.println("-------------------");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Student ID   : " + entry.getKey());
            System.out.println("Student Name : " + entry.getValue());
            System.out.println();
        }

        System.out.print("Enter Student ID to search : ");
        int searchId = sc.nextInt();

        if (students.containsKey(searchId)) {
            System.out.println("Student Name : " + students.get(searchId));
        } else {
            System.out.println("Student record not found.");
        }

        System.out.print("\nEnter Student ID to remove : ");
        int removeId = sc.nextInt();

        if (students.containsKey(removeId)) {
            students.remove(removeId);
            System.out.println("Student record removed successfully.");
        } else {
            System.out.println("Student record not found.");
        }

        System.out.println("\nUpdated Student Records");
        System.out.println("-----------------------");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Student ID   : " + entry.getKey());
            System.out.println("Student Name : " + entry.getValue());
            System.out.println();
        }

        sc.close();
    }
}
