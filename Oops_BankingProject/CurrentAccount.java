package Oops.Project.Oops_BankingProject;

public class CurrentAccount extends BankAccount {
    private  double overdraftLimit;
    public CurrentAccount(int accountNumber, String customerName, double balance,double overdraftLimit) {
        super(accountNumber, customerName, balance);
        this.overdraftLimit=overdraftLimit;

    }

    @Override
    void displayAccountInfo() {
        System.out.println("\nCurrent Account");
        System.out.println("Account No: "+getAccountNumber());
        System.out.println("Customer name: "+getCustomerName());
        System.out.println("Balance: "+getBalance());
        System.out.println("overdraftLimit: "+overdraftLimit);

    }
}
