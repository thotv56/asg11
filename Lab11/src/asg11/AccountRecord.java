/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg11;

import java.io.Serializable;

/**
 *
 * @author GRU-PC
 */
public class AccountRecord implements Serializable{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    TRansactionRecord tr = new TRansactionRecord();
    double tk = Double.parseDouble(tr.getTk());
    double trans = Double.parseDouble(tr.getTrans());
    public AccountRecord(){
    }
    public AccountRecord(int acc, String fName, String lName, double bal){
        this.account = acc;
        this.firstName = fName;
        this.lastName = lName;
        this.balance = bal;
    }

    @Override
    public String toString() {
        return account +"\t"+ firstName +" "+  lastName +"\t"+ balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double combine(){
        
        return balance = tk-trans;
    }
    public static void main(String [] args){
        AccountRecord ac = new AccountRecord();
        System.out.println("So du tai khoan moi la: "+ac.combine());
    }
    
}
