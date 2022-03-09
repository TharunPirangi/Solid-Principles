package solidprinciples.codewithsolid.accounts;

import solidprinciples.codewithsolid.services.BankServices;

public class PremiumAccount implements BankServices {
    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {
        if(amount>50000){
            System.out.println("Max limit for this account is 50,000/-");
        }else{
            // logic for withdraw
            System.out.println("Withdraw successful");
        }
    }
}