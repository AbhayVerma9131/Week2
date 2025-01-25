package packages.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department{
    private double hourlyWage;
    private int hoursWorked;
    private String departmentName;
    
    PartTimeEmployee(String employeeId, String name, double baseSalary, double hourlyWage, int hoursWorked, String departmentName) {
        super(employeeId, name, baseSalary);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.departmentName = departmentName;
    }
    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
    @Override
    public String assignDepartment(){
        return departmentName;
    }
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department Name: " + departmentName);
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        getDepartmentDetails();
        System.out.println("Salary: " + calculateSalary());
        System.out.println("-----------------------------------");
    }
    
}
