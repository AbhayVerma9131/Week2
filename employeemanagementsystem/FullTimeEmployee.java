package packages.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department{
    private int bonus;
    private String DepartmentName;
    FullTimeEmployee(String employeeId,String name,double baseSalary,int bonus,String departmentName){
        super(employeeId,name,baseSalary);
        this.bonus = bonus;
        this.DepartmentName = departmentName;
    }
    @Override
    double calculateSalary(){
        double totalSalary = bonus+ baseSalary;
        return totalSalary;
        
    }
    
    @Override
    public String assignDepartment(){
        return DepartmentName;
    }
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department Name: " + DepartmentName);
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        getDepartmentDetails();
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("----------------------------------------------");


    }
    
    
}