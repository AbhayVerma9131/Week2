package AssistedProgram.employeeMgmtSystem;

class Intern extends Employee{
    private int internshipDuration;
    Intern(String name, double salary, String id, int internshipDuration){
        super(name, salary, id);
        this.internshipDuration = internshipDuration;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration: "+internshipDuration);
    }
}