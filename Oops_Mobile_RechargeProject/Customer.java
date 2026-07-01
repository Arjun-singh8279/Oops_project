package Oops.Project.Oops_Mobile_RechargeProject;

abstract class Customer {
    // Encapsulation : Data Hiding
    private int customerId;
    private String customerName;
    private String mobileNumber;
    private int  rechargeAmount;
    //private String

    // Constructor
    public Customer(int customerId, String customerName, String mobileNumber,int rechargeAmount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.rechargeAmount=rechargeAmount;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
    public  int getRechargeAmount(){
        return rechargeAmount;
    }

    // Common Method
    public void recharge(double amount) {
        System.out.println("Recharge of ₹" + amount + " Successful.");
    }

    // Abstract Method
    abstract void displayCustomerInfo();
}
