package Hierarichical_Inheritance.SchoolSystem;

class Teacher extends person{
    // Define the subject taught by the teacher
    private String subject;

    // Constructor to initialize the teacher object
    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    // Method to display the role of a teacher
    public void displayRole(){
        System.out.println("I am a teacher");
        System.out.println("Subject: " + subject);
        super.displayRole();
    }
}