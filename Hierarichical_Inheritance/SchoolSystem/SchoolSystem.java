package Hierarichical_Inheritance.SchoolSystem;

// Main class to test the SchoolSystem
public class SchoolSystem {
    // Main method to create and display the roles of different school members
    public static void main(String[] args) {
        // Create a teacher object
        Teacher t1 = new Teacher("John Doe", 25, "Mathematics");
        t1.displayRole();

        // Create a student object
        Student s1 = new Student("Jane Smith", 22, "9th");
        s1.displayRole();

        // Create a staff object
        Staff st1 = new Staff("Mike Johnson", 30, "Science");
        st1.displayRole();
    }   
}