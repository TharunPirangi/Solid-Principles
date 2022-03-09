package solidprinciples.codewithsolid;

import solidprinciples.codewithsolid.accounts.*;
import solidprinciples.codewithsolid.notifications.EmailNotification;
import solidprinciples.codewithsolid.notifications.Notification;
import solidprinciples.codewithsolid.services.BankServices;
import solidprinciples.codewithsolid.transactions.TransactionServices;
import solidprinciples.codewithsolid.transactions.Transactions;

public class Main {
    public static void main(String[] args) {

        // dependency inversion principle is used here

        TransactionServices transactionServices = new Transactions();

        BankServices basicAcc = new BasicAccount();
        BankServices premiumAcc = new PremiumAccount();

        // open close principle is used here
        // same method is used with different criteria

        basicAcc.withdraw(15000);
        premiumAcc.withdraw(40000);
        transactionServices.storeTransaction();

        Notification emailNotification = new EmailNotification();
        emailNotification.sendNotification("abc@gmail.com");
    }
}