package Oops.Project.Oops_Mobile_RechargeProject;

public class RegularCustomer extends Customer {
    private String rechargePlan;

    public RegularCustomer(int customerId, String customerName, String mobileNumber,int rechargeAmount,String rechargePlan) {
        super(customerId, customerName, mobileNumber,rechargeAmount);
        this.rechargePlan =rechargePlan;

    }

    @Override
    void displayCustomerInfo() {
        System.out.println("\nRegular Customer");
        System.out.println("Customer ID : " + getCustomerId());
        System.out.println("Customer Name : " + getCustomerName());
        System.out.println("Mobile Number : " + getMobileNumber());
        System.out.println("Recharge Plan : " + rechargePlan);
        System.out.println("Recharge Amount : ₹" + getRechargeAmount());


    }
}
