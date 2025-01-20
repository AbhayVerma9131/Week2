class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "HR", 50000.0);
        System.out.println("Initial Salary: " + employee.getSalary());
        employee.modifySalary(60000.0);
        System.out.println("Modified Salary: " + employee.getSalary());

        Manager manager = new Manager(2, "IT", 70000.0);
        manager.displayEmployeeInfo();
    }
}