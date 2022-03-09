package solidprinciples.codewithoutsolid.services;

// this interface violates interface segregation

import solidprinciples.codewithoutsolid.transactions.Transaction;

public interface BankServices {
    void createAccount();
    void deposit(int amount);
    void withdraw(int amount);
    void addTransactions(Transaction t);
    void printStatement();
}