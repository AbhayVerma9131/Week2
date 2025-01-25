package AssistedProgram.employeeMgmtSystem;


class Manager extends Employee{
    private int teamSize;
    Manager(String name, double salary, String id, int teamSize){
        super(name, salary, id);
        this.teamSize = teamSize;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }

}