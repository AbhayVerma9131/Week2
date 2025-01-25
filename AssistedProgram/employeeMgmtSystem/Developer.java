package AssistedProgram.employeeMgmtSystem;

class Developer extends Employee{
    private String ProgrammingLanguage;
    Developer(String name, double salary, String id, String programmingLanguage){
        super(name, salary, id);
        this.ProgrammingLanguage = programmingLanguage;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+ProgrammingLanguage);
    }
}