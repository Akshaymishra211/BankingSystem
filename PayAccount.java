package com.bank.doc;

public class PayAccount implements Account{
    long accountNumber;
    double balance;
    String name;
    public PayAccount(long accountNumber,String name) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.name=name;
    }
    public String getBalance(){
        return "Your Current Amount is "+this.balance;
    }
    public String deposit(double amount){
        if(amount<=0) {
            return "Invalid Amount...";
        }
        this.balance+=amount;
        return "Successfully Added...";
    }
    public String withdraw(double amount){
        if(this.balance<amount){
            return "Your Account Balance is Low...";
        }
        this.balance-=amount;
        return "Your Account is debited by "+amount+". Your current Amount is "+this.getBalance();
    }
    public long getAccountNumber() {
        return this.accountNumber;
    }
    public void showDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Account Number: "+this.getAccountNumber());
        System.out.println("Balance: "+this.getBalance());
    }
}
