package Oops_Mobile_RechargeProject;

public class RechargePlan {
    // Encapsulation : Data Hiding
    private int planId;
    private String planName;
    private int validity;
    private double amount;

    // Constructor
    public RechargePlan(int planId, String planName, int validity, double amount) {
        this.planId = planId;
        this.planName = planName;
        this.validity = validity;
        this.amount = amount;
    }
    public int getPlanId() {
        return planId;
    }

    public String getPlanName() {
        return planName;
    }

    public int getValidity() {
        return validity;
    }

    public double getAmount() {
        return amount;
    }

    // Display Recharge Plan Details
    public void displayPlanInfo() {

        System.out.println("\nRecharge Plan");
        System.out.println("Plan ID : " + planId);
        System.out.println("Plan Name : " + planName);
        System.out.println("Validity : " + validity + " Days");
        System.out.println("Amount : ₹" + amount);
    }

}
