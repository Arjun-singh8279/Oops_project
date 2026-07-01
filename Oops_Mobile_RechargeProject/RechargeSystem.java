package Oops.Project.Oops_Mobile_RechargeProject;

import java.util.ArrayList;

public class RechargeSystem {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new RegularCustomer(101,"arjun","8279826507",299,"1.5GB/Day"));
        customers.add(new PremiumCustomer(102,"Amit","123467894",599,"2GB/day",100));

        for(Customer customer:customers){
            customer.displayCustomerInfo();
            customer.recharge(customer.getRechargeAmount());
            System.out.println("----------------------------------");
        }


    }
}
