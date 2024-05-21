package ATMMachine;
import java.util.*;

class ATMMachine{

    float balance;
    int PIN = 1345;
    Scanner sc = new Scanner(System.in);
    public void checkpin(){
        System.out.println("enter your pin:");


        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");

        }
    }


    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositeMoney();
        }
        else if(opt==4){
            return;
        }
        else {
            System.out.println("Enter a valid choice ");

        }
    }

    public void checkBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }

    public void withdrawMoney(){
         System.out.println("enter amount to withdraw: ");
         Scanner sc = new Scanner(System.in);
         float amount = sc.nextFloat();
         if(amount>balance){
             System.out.println("Insufficient Balance");
         }
         else{
             balance = balance - amount;
             System.out.println("Money Withdrawl Successful");
         }
         menu();
    }


    public void depositeMoney(){
        System.out.println("enter the amount: ");
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited successfully");
        menu();
    }

    public static void main(String[] args) {
        ATMMachine obj = new ATMMachine();
        obj.checkpin();

    }


}

