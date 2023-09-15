package Projects.AtmSimulator;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.DecimalFormat;

//Main class

public class OptionMenu extends Account{

    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

    //Validate login information(Customer number and Pin number)

    public void getLogin()throws IOException{

        int x=1;

        do{
            try{

                data.put(123456789, 1234);
                data.put(987654321, 9876);

                System.out.println("\nWelcome to the ATM Machine\n");

                System.out.println("Enter your Customer Number");
                setCustomerNumber(sc.nextInt());

                System.out.println("Enter your Pin Number");
                setPinNumber(sc.nextInt()); 

            }catch(Exception e){

                System.out.println("\nInvalid Characters.Only numbers are VALID!\n");
                System.out.println("\nWrong Customer Number or Pin Number\n");
                x=2;
            }

        

        for(Entry<Integer, Integer> entry : data.entrySet()){

            if(entry.getKey() == getCustomerNumber() && entry.getValue() ==getPinNumber()){

                getAccountType();

            }
        }

    }while(x==1);

}
    
    /*Display Account Type Menu with selection*/

    public void getAccountType(){

        System.out.println("Select the account type you want to access: ");
        System.out.println("Type 1-Checking Account");
        System.out.println("Type 2-Saving Account");
        System.out.println("Type 3-EXIT");

        select= sc.nextInt();

        switch(select){

            case 1:
            getChecking();
            break;

            case 2:
            getSaving();
            break;

            case 3:
            System.out.println("\nThanks for using the ATM.\n");
            break;

            /*default:
            System.out.println("\nINVALID CHOICE!\n");
            getAccountType();*/

        }
    }

    /*Display Checking Account Menu Selection details*/

    public void getChecking(){
        
        System.out.println("Checking Account: ");
        System.out.println("Type 1- Check balance");
        System.out.println("Type 2- Withdraw fund");
        System.out.println("Type 3- Deposit fund");
        System.out.println("Type 4- Exit");
        System.out.print("Choice: ");

        select=sc.nextInt();

        switch(select){

            case 1:
            System.out.println("Checking Account Balance: "+moneyformat.format(getCheckingBalance()));
            getAccountType();
            break;

            case 2:
            getCheckingWithdrawInput();
            getAccountType();
            break;

            case 3:
            getCheckingDepositInput();
            getAccountType();
            break;

            case 4:
            System.out.println("\nThank you for using the ATM.\n");

           /*default:
            System.out.println("\nINVALID CHOICE\n");
            getChecking();*/

        }


    }

     /*Display Saving Account Menu Selection details*/

     public void getSaving(){
        
        System.out.println("Saving Account: ");
        System.out.println("Type 1- Check balance");
        System.out.println("Type 2- Withdraw fund");
        System.out.println("Type 3- Deposit fund");
        System.out.println("Type 4- Exit");
        System.out.print("Choice: ");

        select=sc.nextInt();

        switch(select){

            case 1:
            System.out.println("Saving Account Balance: "+ moneyformat.format(getSavingBalance()));
            getAccountType();
            break;

            case 2:
            getSavingWithdrawInput();
            getAccountType();
            break;

            case 3:
            getSavingDepositInput();
            getAccountType();
            break;

            case 4:
            System.out.println("\nThank you for using the ATM.\n");

            /*default:
            System.out.println("\nINVALID CHOICE\n");
            getSaving();*/
            
        }


    }
    private int select;
}

