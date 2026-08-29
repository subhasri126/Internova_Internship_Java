import java.util.HashSet;
import java.util.Scanner;

public class UniqueCourses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> courses = new HashSet<>();

        System.out.println("Enter 7 course names:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Course " + (i + 1) + " : ");
            courses.add(sc.nextLine());
        }

        System.out.println("\n======================================");
        System.out.println("           UNIQUE COURSES");
        System.out.println("======================================");

        System.out.println("\nFinal HashSet");
        System.out.println("-------------");

        for (String course : courses) {
            System.out.println(course);
        }

        System.out.print("\nEnter course name to search : ");
        String searchCourse = sc.nextLine();

        if (courses.contains(searchCourse)) {
            System.out.println("Course found.");
        } else {
            System.out.println("Course not found.");
        }

        System.out.println("\nTotal Unique Courses : " + courses.size());

        sc.close();
    }
}
