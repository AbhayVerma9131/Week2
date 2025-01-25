package Hierarichical_Inheritance.BankAccountTypes;

// Main class to test the BankAccountTypes
public class BankAccountTypes{
    // Main method to create and display different types of bank accounts
    public static void main(String[] args) {
        // Create a SavingsAccount object
        BankAccount account1 = new SavingsAccount("123456789", 1000.0,10);
        account1.displayAccountInformation();

        // Create a CheckingAccount object
        BankAccount account2 = new CheckingAccount("987654321", 500.0, 2000.0);
        account2.displayAccountInformation();

        // Create a FixDepositAccount object
        BankAccount account3 = new FixDepositAccount("567890123", 2000.0, 2);
        account3.displayAccountInformation();
    }
}