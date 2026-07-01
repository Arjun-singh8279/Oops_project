package Oops.Project.Oops_BankingProject;

import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts=new ArrayList<>();
        //object creation
        accounts.add(new SavingAccount(101,"Arjun",1000,5));
        accounts.add(new CurrentAccount(102,"amit",20000,5000));
        accounts.add(new SavingAccount(102,"Aonik",1,0.1));
        accounts.add(new SavingAccount(103,"Sumit",1000,1.5));

        //Banking operations
        accounts.get(0).deposit(3000);
        accounts.get(1).withdraw(4000);

        //Runtime Polymorphism
        //parent reference accessing child object
        for(BankAccount account:accounts){
            account.displayAccountInfo();

            System.out.println("----------------");
        }
    }
}
