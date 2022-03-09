package solidprinciples.codewithsolid.accounts;

import solidprinciples.codewithsolid.notifications.EmailNotification;
import solidprinciples.codewithsolid.notifications.MessageNotification;
import solidprinciples.codewithsolid.notifications.Notification;
import solidprinciples.codewithsolid.services.BankServices;
import solidprinciples.codewithsolid.transactions.Transaction;
import solidprinciples.codewithsolid.transactions.TransactionServices;
import solidprinciples.codewithsolid.transactions.Transactions;

// BasicAccount,MessageNotification and Transactions together achieve srp

public class BasicAccount extends MessageNotification implements BankServices {
    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {
        if(amount>10000){
            System.out.println("You cannot withdraw more than 10000!!!");
        }
        else{
            TransactionServices transaction = new Transactions();
            transaction.storeTransaction();
            System.out.println("Withdraw successful");
        }
        Notification notification = new EmailNotification();
        notification.sendNotification("abc@gmail.com");
    }
}