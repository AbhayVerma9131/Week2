package Hierarichical_Inheritance.BankAccountTypes;
// SavingsAccount class extends BankAccount to inherit its properties
class SavingsAccount extends BankAccount{
    // Interest rate is private to ensure data encapsulation
    private double interestRate;

    // Constructor to initialize account number, balance, and interest rate
    SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account information, including interest rate
    public void displayAccountInformation(){
        System.out.println("Saving Account");
        super.displayAccountInformation();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}        
