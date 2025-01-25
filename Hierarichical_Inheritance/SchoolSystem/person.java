package Hierarichical_Inheritance.SchoolSystem;

class person{
    // Define the properties of a person
    private String name;
    private int age;

    // Constructor to initialize the person object
    person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method to display the role of a person
    public void displayRole(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
