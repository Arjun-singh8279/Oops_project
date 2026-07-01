package Oops.Project.Oops_Mobile_RechargeProject;

public class PremiumCustomer extends Customer{
    private String rechargePlan;

    private int rewardPoints;
    public PremiumCustomer(int customerId, String customerName, String mobileNumber,int rechargeAmount,String rechargePlan,int rewardPoints) {
        super(customerId, customerName, mobileNumber,rechargeAmount);
        this.rechargePlan = rechargePlan;
        this.rewardPoints = rewardPoints;
    }

    @Override
    void displayCustomerInfo() {
        System.out.println("\nPremium Customer");
        System.out.println("Customer ID : " + getCustomerId());
        System.out.println("Customer Name : " + getCustomerName());
        System.out.println("Mobile Number : " + getMobileNumber());
        System.out.println("Recharge Plan : " + rechargePlan);
        System.out.println("Recharge Amount : ₹" + getRechargeAmount());
        System.out.println("Reward Points : " + rewardPoints);

    }
}
