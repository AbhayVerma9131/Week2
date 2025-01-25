package Hierarichical_Inheritance.SchoolSystem;

// Student class extends the person class
class Student extends person{
    // Define the grade of the student
    private String grade;

    // Constructor to initialize the student object
    Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }

    // Method to display the role of a student
    public void displayRole(){
        System.out.println("I am a student");
        System.out.println("Grade: " + grade);
        super.displayRole();
    }
}