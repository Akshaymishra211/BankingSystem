package com.bank.doc;

public class IDBCDatabase {
    SaveAccount[] savecustomers=new SaveAccount[100];
    int savepointer=0;
    PayAccount[] paycustomers=new PayAccount[100];
    int paypointer=0;
    long min=100000000000l,max=999999999999l;
    public long generateAccountNumber(String name,String type){
        long accountNumber=(long)(Math.random()*(max-min)+min);
        while(!unique(accountNumber)){
            accountNumber=(long)(Math.random()*(max-min)+min);
        }
        if(type.equals("saving"))
            this.savecustomers[this.savepointer++]=new SaveAccount(accountNumber,2.5f,name);
        else
            this.paycustomers[this.paypointer++]=new PayAccount(accountNumber,name);
        return accountNumber;
    }
    public boolean unique(long accountNumber) {
        for (int i = 0; i < this.savepointer; i++) {
            if (this.savecustomers[i].getAccountNumber() == accountNumber) {
                return false;
            }
        }
        for(int i=0;i<paypointer;i++){
            if(this.paycustomers[i].getAccountNumber()==accountNumber){
                return false;
            }
        }
        return true;
    }
    public Account getAccount(long accountNumber){
        for(int i=0;i<savepointer;i++){
            if(this.savecustomers[i].getAccountNumber()==accountNumber){
                return savecustomers[i];
            }
        }
        for(int i=0;i<paypointer;i++){
            if(this.paycustomers[i].getAccountNumber()==accountNumber){
                return paycustomers[i];
            }
        }
        return null;
    }
}
