package Oops.Project.Oops_BankingProject;

//abstract is a keyword
abstract class BankAccount {
    //Encapsulation : data hiding concept;
    private int accountNumber;
    private String customerName;
    private double balance;

    //Canstructor
    public BankAccount(int  accountNumber,String customerName,double balance){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.balance=balance;

    }
//geter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  void deposit(double amount){
        balance+=amount;
        System.out.println(amount+" deposited succesfully");
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println(amount+" withdrow suceesfully");
        }
        else{
            System.out.println("overdraftLimt occer");
        }
    }
    
    //1.abstract method // 2.child classes will implement it
    abstract void displayAccountInfo();
}
