package com.bank.doc;

public class SaveAccount implements Account{
    long accountNumber;
    float interest;
    double balance;
    String name;
    public SaveAccount(long accountNumber,float interest,String name){
        this.accountNumber=accountNumber;
        this.interest=interest;
        this.balance=0;
        this.name=name;
    }
    public String getBalance() {
        return "Your Current Account Balance is "+this.balance;
    }
    public String deposit(double amount){
        if(amount<=0) {
            return "Invalid Amount...";
        }
        this.balance+=amount;
        return "Successfully Added...";
    }
    public String withdraw(double amount) {
        if (this.balance < amount) {
            return "Your Account Balance is Low...";
        }
        this.balance -= amount;
        return "Your Account is debited by " + amount + ". Your current Amount is " + this.getBalance();
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }
    public void showDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Account Number: "+this.getAccountNumber());
        System.out.println("Balance: "+this.getBalance());
    }
}
