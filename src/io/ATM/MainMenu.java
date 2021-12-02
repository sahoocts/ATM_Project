package io.ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class MainMenu extends Account{

    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$',###,##0.00");
    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
    public void getLogin()throws IOException {
        int i=1;
        do{
            try{
                data.put(9889,4353);
                data.put(1111,2222);
                data.put(333,555);
                System.out.println("Welcome ATM");
                System.out.println("Enter your customer number");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your pin number");
                setPinNumber(menuInput.nextInt());
            }
            catch(Exception e){
                System.out.println("\n"+"invalid Character(s).Only Number."+"\n");
                i=2;
            }
            int cn=getCustomerNumber();
            int pn=getPinNumber();
            System.out.println("::::"+data.get(cn));
            if(data.containsKey(cn) && data.get(cn)==pn){
                getAccountType();
            }
            else{
                System.out.println("\n"+"Wrong Customer Number"+"\n");
            }
        }while(i==1);
    }
    public void getAccountType(){
        System.out.println("Select the account you want to access");
        System.out.println("Press 1 - Current Account");
        System.out.println("Press 2 - Saving Account");
        System.out.println("Press 3 - EXIT");
        int selection=menuInput.nextInt();
        switch (selection){
            case 1:
                getCurrent();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using ATM");
                break;
            default:
                System.out.println("Invalid invoice");
                getAccountType();
        }
    }
    public void getCurrent(){
        System.out.println("Current account");
        System.out.println("Press 1 - View Balance");
        System.out.println("Press 2 - Widthdraw  funds");
        System.out.println("Press 3 - Deposit funds");
        System.out.println("Press 4 - Exit");
        System.out.println("Choice:");
        int selection=menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("The Current account balance:" +moneyFormat.format(getCurrentBalance()));
                getAccountType();
                break;
            case 2:
                getCurrentWidthdrawInput();
                getAccountType();
                break;

            case 3:
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you using ATM");
                break;
            default:
                System.out.println("Invalid choice");
                getCurrent();
        }

    }

    public void getSaving(){
        System.out.println("saving account");
        System.out.println("Press 1 - View Balance");
        System.out.println("Press 2 - Widthdraw  funds");
        System.out.println("Press 3 - Deposit funds");
        System.out.println("Press 4 - Exit");
        System.out.println("Choice:");
        int selection=menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("The saving account balance:" +moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWidthDrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you using ATM");
                break;
            default:
                System.out.println("Invalid choice");
                getSaving();

        }
    }
}
