import studentmanagement.Student;

public class PackageDemo {

    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Subhasri S",
                "Computer Science and Engineering"
        );

        System.out.println("======================================");
        System.out.println("       STUDENT MANAGEMENT");
        System.out.println("======================================");

        System.out.println();

        student.displayStudent();
    }
}