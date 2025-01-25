package HybrideInheritance.ResturantMGMT;
class person{
    // Private fields to store the name and ID of a person
    private String name;
    private String Id;

    // Constructor to initialize the name and ID
    person(String name, String Id){
        this.name = name;
        this.Id = Id;
    }

    // Method to perform duties (display name and ID)
    public void performDuies(){
        System.out.println(name + " " + Id);
    }
}