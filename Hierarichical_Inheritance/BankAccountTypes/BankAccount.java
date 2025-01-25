package Hierarichical_Inheritance.BankAccountTypes;
class BankAccount{
    // Account number and balance are private to ensure data encapsulation
    private String accountNumber;
    private double balance;

    // Constructor to initialize account number and balance
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account information
    public void displayAccountInformation(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}