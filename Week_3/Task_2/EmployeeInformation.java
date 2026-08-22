class Employee {

    int employeeId;
    String employeeName;
    String department;
    double salary;

    Employee() {
        employeeId = 0;
        employeeName = "Not Assigned";
        department = "Not Assigned";
        salary = 0.0;
    }

    Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println();
    }
}

public class EmployeeInformation {
    public static void main(String[] args) {

        Employee defaultEmployee = new Employee();

        Employee parameterizedEmployee =
                new Employee(102, "Subhasri S", "Development", 30000.0);

        System.out.println("Employee Information");
        System.out.println("--------------------");
        System.out.println();

        System.out.println("Default Constructor");
        System.out.println("-------------------");
        defaultEmployee.displayEmployee();

        System.out.println("Parameterized Constructor");
        System.out.println("-------------------------");
        parameterizedEmployee.displayEmployee();
    }
}