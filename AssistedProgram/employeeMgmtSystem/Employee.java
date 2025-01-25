package AssistedProgram.employeeMgmtSystem;
class Employee{
    private String name;
    private double Salary;
    private String id;
    Employee(String name, double salary, String id){
        this.name = name;
        this.Salary = salary;
        this.id = id;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+Salary);
    }

}

