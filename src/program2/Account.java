package program2;

import java.util.Date;
import java.text.DecimalFormat;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate =0;
    private Date dateCreated = new Date();
    private static DecimalFormat dec = new DecimalFormat(".###");


    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRAte(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    //calculations for monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    //gives user the interest of their balance per month
    public double getMonthlyInterest(){
        return (getMonthlyInterestRate()*balance);

    }

    public void withdraw(double amount){
        balance= balance-amount;
    }

    public void deposit(double amount){
        balance= balance+amount;
    }

    @Override
    public String toString(){

        return "Account ID:  " + id+"\nAccount Balance: $"+dec.format(balance)
                +"\nAnnual Interest Rate: "+dec.format(annualInterestRate*100)+" %"+"\nMonthly Interest: "
                +dec.format(getMonthlyInterest())+"\nDate Opened: "+getDateCreated()+"\n\n*******************************";
    }

}
