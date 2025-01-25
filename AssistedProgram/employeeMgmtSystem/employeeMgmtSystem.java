package AssistedProgram.employeeMgmtSystem;


public class employeeMgmtSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", 50000, "E001");
        Manager m1 = new Manager("Jane Doe", 70000, "M001", 5);
        Developer d1 = new Developer("Mike Doe", 60000, "D001", "Java");
        Intern i1 = new Intern("Sarah Doe", 40000, "I001", 3);
        e1.displayDetails();
        m1.displayDetails();
        d1.displayDetails();
        i1.displayDetails();
    }
}
