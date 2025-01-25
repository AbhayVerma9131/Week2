package HybrideInheritance.ResturantMGMT;

// Class for chefs (extends person and implements Worker)
class chef extends person implements Worker{
    // Constructor to initialize the name and ID
    chef(String name, String Id){
        super(name, Id);
    }

    // Method to perform duties (display chef-specific message and call super method)
    public void performDuties() {
        System.out.println("I'm a chef");
        super.performDuies();
    }
}