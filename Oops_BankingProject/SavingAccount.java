package Oops.Project.Oops_BankingProject;

public class SavingAccount extends BankAccount {
private double interestRate;
    public SavingAccount(int accountNumber, String customerName, double balance,double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate=interestRate;
    }

    @Override
    void displayAccountInfo() {
        System.out.println("\nSavings Account");
        System.out.println("Account No: "+getAccountNumber());
        System.out.println("Customer name: "+getCustomerName());
        System.out.println("Balance: "+getBalance());
        System.out.println("interestRate: "+interestRate+"%");

    }
}
