import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class StudentRecordManager {

    static HashMap<Integer, String> studentNames = new HashMap<>();
    static HashMap<Integer, String> studentCourses = new HashMap<>();
    static HashMap<Integer, Integer> studentAges = new HashMap<>();
    static HashSet<String> courses = new HashSet<>();

    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {

        try {
            System.out.print("Enter Student ID   : ");
            int id = sc.nextInt();
            sc.nextLine();

            if (studentNames.containsKey(id)) {
                System.out.println("Error: Student ID already exists.");
                return;
            }

            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Course       : ");
            String course = sc.nextLine();

            System.out.print("Enter Age          : ");
            int age = sc.nextInt();

            if (age <= 0) {
                System.out.println("Error: Invalid age.");
                return;
            }

            studentNames.put(id, name);
            studentCourses.put(id, course);
            studentAges.put(id, age);
            courses.add(course);

            System.out.println("Student added successfully.");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid input.");
            sc.nextLine();
        }
    }

    public static void viewStudents() {

        if (studentNames.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n======================================");
        System.out.println("          STUDENT RECORDS");
        System.out.println("======================================");

        for (Map.Entry<Integer, String> entry : studentNames.entrySet()) {

            int id = entry.getKey();

            StringBuilder details = new StringBuilder();

            details.append("Student ID   : ").append(id).append("\n");
            details.append("Student Name : ").append(entry.getValue()).append("\n");
            details.append("Course       : ").append(studentCourses.get(id)).append("\n");
            details.append("Age          : ").append(studentAges.get(id)).append("\n");

            System.out.println(details);
        }
    }

    public static void searchStudent() {

        try {
            System.out.print("Enter Student ID to search : ");
            int id = sc.nextInt();

            if (studentNames.containsKey(id)) {

                StringBuilder details = new StringBuilder();

                details.append("\nStudent Found\n");
                details.append("-------------\n");
                details.append("Student ID   : ").append(id).append("\n");
                details.append("Student Name : ").append(studentNames.get(id)).append("\n");
                details.append("Course       : ").append(studentCourses.get(id)).append("\n");
                details.append("Age          : ").append(studentAges.get(id)).append("\n");

                System.out.println(details);

            } else {
                System.out.println("Student not found.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Student ID must be a number.");
            sc.nextLine();
        }
    }

    public static void removeStudent() {

        try {
            System.out.print("Enter Student ID to remove : ");
            int id = sc.nextInt();

            if (studentNames.containsKey(id)) {

                studentNames.remove(id);
                studentCourses.remove(id);
                studentAges.remove(id);

                System.out.println("Student removed successfully.");

            } else {
                System.out.println("Student not found.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Student ID must be a number.");
            sc.nextLine();
        }
    }

    public static void displayUniqueCourses() {

        System.out.println("\n======================================");
        System.out.println("          UNIQUE COURSES");
        System.out.println("======================================");

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (String course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {

        int choice = 0;

        do {

            System.out.println("\n======================================");
            System.out.println("       STUDENT RECORD MANAGER");
            System.out.println("======================================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice : ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        removeStudent();
                        break;

                    case 5:
                        displayUniqueCourses();
                        break;

                    case 6:
                        System.out.println("Thank you for using Student Record Manager.");
                        break;

                    default:
                        System.out.println("Error: Invalid menu choice.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Please enter a valid menu number.");
                sc.nextLine();
            }

        } while (choice != 6);

        sc.close();
    }
}



