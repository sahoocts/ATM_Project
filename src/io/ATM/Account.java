package io.ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double currentBalance=0;
    private double savingBalance=0;
    DecimalFormat moneyFormat=new DecimalFormat("'$',###,##0.00");
    Scanner input=new Scanner(System.in);
    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public double calcCurrentWithdraw(double amount){
        currentBalance=(currentBalance- amount);
        return currentBalance;
    }

public double getSavingBalance(){
    return savingBalance;
}

public double calcSavingWidthdraw(double amount){
    savingBalance=(savingBalance-amount);
    return savingBalance;
}

public  double clacCurrentDeposit(double amount){
        currentBalance=(currentBalance+amount);
        return currentBalance;
}


public double clacSavingDeposit(double amount){
    savingBalance=(savingBalance+amount);
    return savingBalance;
}
public void getCurrentWidthdrawInput(){
        System.out.println("Current Acc balance :"+moneyFormat.format(currentBalance));
    System.out.println("Amount you want to width draw");
    double amount=input.nextDouble();
    if((currentBalance-amount)>=0){
        calcCurrentWithdraw(amount);
        System.out.println("new Current Acc balance :"+moneyFormat.format(currentBalance));
    }
    else{
        System.out.println("Balance cant b negetive");
    }

}
public void getCurrentDepositInput(){
    System.out.println("Current Acc balance :"+moneyFormat.format(currentBalance));
    System.out.println("Amount you want to diposit");
    double amount=input.nextDouble();
    if((currentBalance+amount)>=0){
        clacCurrentDeposit(amount);
        System.out.println("new Current Acc balance :"+moneyFormat.format(currentBalance));
    }
    else{
        System.out.println("Balance cant b negetive");
    }
}
public void getSavingDepositInput(){
    System.out.println("Saving Acc balance :"+moneyFormat.format(savingBalance));
    System.out.println("Amount you want to diposit to saving accout");
    double amount=input.nextDouble();
    if((savingBalance+amount)>=0){
        clacSavingDeposit(amount);
        System.out.println("new Saving Acc balance :"+moneyFormat.format(savingBalance));
    }
    else{
        System.out.println("Balance cant b negetive");
    }

    }

   public void getSavingWidthDrawInput(){
       System.out.println("Saving Acc balance :"+moneyFormat.format(savingBalance));
       System.out.println("Amount you want to widthdraw from saving accout");
       double amount=input.nextDouble();
       if((savingBalance-amount)>=0){
           calcSavingWidthdraw(amount);
           System.out.println("new Saving Acc balance :"+moneyFormat.format(savingBalance));
       }
       else{
           System.out.println("Balance cant b negetive");
       }

   }
}


