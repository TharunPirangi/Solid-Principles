package solidprinciples.codewithsolid.transactions;


import java.util.ArrayList;

public class Transactions implements TransactionServices {

    @Override
    public void storeTransaction() {
        System.out.println("transaction stored");
    }

    @Override
    public void printTransactions() {
        System.out.println("printing transactions");
    }
}