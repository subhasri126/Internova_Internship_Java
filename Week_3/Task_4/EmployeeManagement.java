class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name       : " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary     : " + salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(String name, int employeeId, double salary, int teamSize) {

        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team Size  : " + teamSize);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Developer developer =
                new Developer("Subhasri", 101, 45000.0, "Java");

        Manager manager =
                new Manager("Sathish", 102, 55000.0, 8);

        System.out.println("Employee Management");
        System.out.println("-------------------");
        System.out.println();

        System.out.println("Developer Details");
        System.out.println("------------------");
        developer.displayDeveloper();

        System.out.println();

        System.out.println("Manager Details");
        System.out.println("---------------");
        manager.displayManager();
    }
}