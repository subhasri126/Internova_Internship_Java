class Student {
    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    Student(String studentName, int rollNumber, String branch, double cgpa) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    void displayStudent() {
        System.out.println("Name       : " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch     : " + branch);
        System.out.println("CGPA       : " + cgpa);
        System.out.println();
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Student student1 = new Student("Subhasri S", 101, "CSE", 9.18);
        Student student2 = new Student("Sathish M", 102, "CSE", 9.00);
        Student student3 = new Student("Vasundra M", 103, "CSE", 8.90);

        System.out.println("Student Management");
        System.out.println("------------------");
        System.out.println();

        System.out.println("Student 1");
        System.out.println("---------");
        student1.displayStudent();

        System.out.println("Student 2");
        System.out.println("---------");
        student2.displayStudent();

        System.out.println("Student 3");
        System.out.println("---------");
        student3.displayStudent();
    }
}