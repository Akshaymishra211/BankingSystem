package com.bank.doc;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IDBCDatabase database=new IDBCDatabase();
        while(true){
            System.out.println("Welcome User....");
            System.out.println("To Create Account Enter 1...");
            System.out.println("To View Account Enter 2...");
            System.out.println("To Exit from current session Enter 3...");
            int input=Integer.parseInt(sc.nextLine());
            if(input==1){
                System.out.println("Enter Your Name...");
                String name=sc.nextLine();
                System.out.println("Account Type You Want To Create...");
                String type=sc.nextLine();
                long accountNumber=database.generateAccountNumber(name,type);
                System.out.println("Congratulations! Your Account has been created. Please Note your Account Number "+accountNumber);
            }
            else if(input==2){
                System.out.println("Please enter your account number...");
                long accountNumber=Long.parseLong(sc.nextLine());
                Account account=database.getAccount(accountNumber);
                if(account==null){
                    System.out.println("Try Again...Wrong!!!");
                }
                else{
                    System.out.println("Hello! Your Account Details...");
                    account.showDetails();
                }
            }
            else if(input==3){
                System.out.println("Thanks for using this application...");
                break;
            }
            else{
                System.out.println("Your session expired... Try Again");
            }
        }
    }
}
