package packages.employeemanagementsystem;

public class main {
    public static void main(String[] args) {
        FullTimeEmployee employee = new FullTimeEmployee("AR111","Raya",15000,1000,"HR");
        employee.displayDetails();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("AR111","Rava",15000,100,48,"HR");
        partTimeEmployee.displayDetails();
    }
}
