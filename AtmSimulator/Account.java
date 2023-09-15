package Projects.AtmSimulator;

import java.util.*;
import java.text.DecimalFormat;

public class Account {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");

    //Set the customer number 

    public int setCustomerNumber(int customerNumber ){

        this.customerNumber=customerNumber;
        return customerNumber;

    }

    //Get the customer number

    public int getCustomerNumber(){

        return customerNumber;

    }

    //Set the pin number

    public int setPinNumber(int pinNumber){

        this.pinNumber=pinNumber;
        return pinNumber;

    }

    //Get the pin number

    public int getPinNumber(){

        return pinNumber;

    }

    //Get the Checking balance

    public double getCheckingBalance(){

        return checkingBalance;

    }

    //Get the Saving balance

    public double getSavingBalance(){

        return savingBalance;

    }

    //Calculate Checking account Withdrawl
    
    public double calcCheckingWithdraw(double amount){

        checkingBalance=(checkingBalance-amount);
        return checkingBalance;

    }

    //Calculate Saving account Withdrawl
    
    public double calcSavingWithdraw(double amount){

        savingBalance=(savingBalance-amount);
        return savingBalance;
        
    }

    //Customer Checking account withdraw input

    public void getCheckingWithdrawInput(){

        System.out.println("Checking account Balance: "+moneyformat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from the checking Account: ");
        double amount=sc.nextDouble();

        if((checkingBalance-amount)>0){

            calcCheckingWithdraw(amount);
            System.out.println("New Checking account balance: "+moneyformat.format(checkingBalance));

        }

        else{

            System.out.println("Checking Balance cannot be negative.\n");

        }
    }

        //Customer Saving account withdraw input

        public void getSavingWithdrawInput(){

            System.out.println("Saving account Balance: "+moneyformat.format(savingBalance));
            System.out.println("Amount you want to withdraw from the saving Account: ");
            double amount=sc.nextDouble();
    
            if((savingBalance-amount)>=0){
    
                calcSavingWithdraw(amount);
                System.out.println("New Saving account balance: "+moneyformat.format(savingBalance));
    
            }
    
            else{
    
                System.out.println("Saving Balance cannot be negative.+\n");
                
            }
        }

        //Caculate Checking account deposit

        public double calcCheckingDeposit(double amount){

            checkingBalance =(checkingBalance + amount );
            return checkingBalance;

        }

        //Caculate Saving account deposit

        public double calcSavingDeposit(double amount){

            savingBalance =(savingBalance + amount );
            return savingBalance;

        }

        //Customer Checking account deposit input

        public void getCheckingDepositInput(){

            System.out.println("Checking account balance: "+moneyformat.format(checkingBalance));
            System.out.println("Amount you want to deposit into the Checking Account: ");
            double amount=sc.nextDouble();

            calcCheckingDeposit(amount);
            System.out.println("New Checking account balance: "+moneyformat.format(checkingBalance));

        }

        //Customer Saving account deposit input

        public void getSavingDepositInput(){

            System.out.println("Saving account balance: "+moneyformat.format(savingBalance));
            System.out.println("Amount you want to deposit into the Saving Account: ");
            double amount=sc.nextDouble();

            calcSavingDeposit(amount);
            System.out.println("New Saving account balance: "+moneyformat.format(savingBalance));

        }

        private int customerNumber=0;
        private int pinNumber=0;
        private double checkingBalance=0.0;
        private double savingBalance=0.0;
}


