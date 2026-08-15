import java.util.Scanner;
public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks of 5 students:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = total / 5.0;

        System.out.println("\n======================================");
        System.out.println("          STUDENT MARKS");
        System.out.println("======================================");

        System.out.print("Marks: ");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\nTotal Marks   : " + total);
        System.out.printf("Average Marks : %.2f%n", average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}

