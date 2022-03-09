package solidprinciples.codewithoutsolid.accounts;

// this class violates single responsibility principle

import solidprinciples.codewithoutsolid.services.BankServices;
import solidprinciples.codewithoutsolid.transactions.Transaction;

public class BasicAccount implements BankServices {

    @Override
    public void createAccount() {

    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {
        if(amount>10000){
            System.out.println("Withdraw failed. Maximum limit 10000");
        }else{
            //withdraw logic
        }
    }

    @Override
    public void addTransactions(Transaction t) {

    }

    @Override
    public void printStatement() {

    }
}