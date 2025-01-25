package Hierarichical_Inheritance.SchoolSystem;

// Staff class extends the person class
class Staff extends person{
    // Define the department of the staff member
    private String department;

    // Constructor to initialize the staff object
    Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    // Method to display the role of a staff member
    public void displayRole(){
        System.out.println("I am a staff member");
        System.out.println("Department: " + department);

        super.displayRole();
    }
}