package com.bank.doc;

public interface Account {
    String getBalance();
    String deposit(double amount);
    String withdraw(double amount);
    long getAccountNumber();
    void showDetails();
}
