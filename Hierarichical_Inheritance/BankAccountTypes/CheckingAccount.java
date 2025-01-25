package Hierarichical_Inheritance.BankAccountTypes;
// CheckingAccount class extends BankAccount to inherit its properties
class CheckingAccount extends BankAccount{
    // Withdrawal limit is private to ensure data encapsulation
    private double withdrawlLimit;

    // Constructor to initialize account number, balance, and withdrawal limit
    CheckingAccount(String accountNumber, double balance, double withdrawlLimit){
        super(accountNumber, balance);
        this.withdrawlLimit = withdrawlLimit;
    }

    // Method to display account information, including withdrawal limit
    public void displayAccountInformation(){
        System.out.println("Checking Account");
        super.displayAccountInformation();
        System.out.println("Withdrawal Limit: $" + withdrawlLimit);
    }
}