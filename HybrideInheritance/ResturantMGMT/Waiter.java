package HybrideInheritance.ResturantMGMT;

// Class for waiters (extends person and implements Worker)
class Waiter extends person implements Worker{
    // Constructor to initialize the name and ID
    Waiter(String name, String Id){
        super(name, Id);
    }

    // Method to perform duties (display waiter-specific message and call super method)
    public void performDuties() {
        System.out.println("I'm a waiter");
        super.performDuies();
    }
}
