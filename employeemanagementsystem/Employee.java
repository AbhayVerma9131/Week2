package packages.employeemanagementsystem;

abstract class Employee {
    public String employeeId;
    public String name;
    public double baseSalary;
    Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
    }
}