package HybrideInheritance.ResturantMGMT;

// Main class for the restaurant management system
public class ResturantMGMTSystem {
    // Main method to test the classes
    public static void main(String[] args) {
        // Create a chef and perform duties
        chef chef1 = new chef("John", "123");
        chef1.performDuties();

        // Create a waiter and perform duties
        Waiter waiter1 = new Waiter("Jane", "456");
        waiter1.performDuties();
    }
}