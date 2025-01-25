package Hierarichical_Inheritance.BankAccountTypes;
// FixDepositAccount class extends BankAccount to inherit its properties
class FixDepositAccount extends BankAccount{
    // Tenure is private to ensure data encapsulation
    private double tenure;

    // Constructor to initialize account number, balance, and tenure
    FixDepositAccount(String accountNumber, double balance, double tenure){
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    // Method to display account information, including tenure
    public void displayAccountInformation(){
        System.out.println("Fix Deposit Account");
        super.displayAccountInformation();
        System.out.println("Tenure: " + tenure + " years");
    }
}