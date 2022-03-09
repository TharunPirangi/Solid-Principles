package solidprinciples.codewithoutsolid;

import solidprinciples.codewithoutsolid.accounts.BasicAccount;
import solidprinciples.codewithoutsolid.accounts.PremiumAccount;
import solidprinciples.codewithoutsolid.transactions.Transaction;
import solidprinciples.codewithoutsolid.notifications.EmailNotification;

public class Main {
    public static void main(String[] args) {

        // dependency inversion is violated
        // as we are dealing with concrete class objects

        BasicAccount basicAccount = new BasicAccount();
        PremiumAccount premiumAccount = new PremiumAccount();


        basicAccount.deposit(100);
        basicAccount.withdraw(100);
        basicAccount.addTransactions(new Transaction(1,"Debit",100));
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendEmailNotification("abc@gmail.com");

        premiumAccount.withdraw(100);
        premiumAccount.addTransactions();
        emailNotification.sendEmailNotification("abc@gmail.com");
    }
}