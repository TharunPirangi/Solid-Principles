package solidprinciples.codewithoutsolid.accounts;

// Withdraw may not work based on changing criteria
// so this violates open close principle

public class PremiumAccount {

    public void createAccount() {

    }

    public void deposit(int amount) {

    }

    public void withdraw(int amount) {
        if(amount>50000){
            System.out.println("Withdraw failed. Maximum limit is 50000");
        }else{
            //withdraw logic
        }
    }

    public void addTransactions() {

    }

    public void printStatement() {

    }
}