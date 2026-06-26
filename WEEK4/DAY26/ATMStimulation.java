package WEEK4.DAY26;
import java .util.Scanner;
public class ATMStimulation {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("ATM----MENU");
        System.out.println(" 1: Check Balance");
        System.out.println(" 2:deposit");
        System.out.println("3:Withdrawal");

        System.out.println("Enter your choice:");
         int choice = sc.nextInt();

         if(choice==1){
            System.out.println("The current balance is: "+balance);
         }
         else if(choice==2){
            System.out.println("Enter the amount of money you want to deposit:");

            double deposit = sc.nextDouble();
            balance = balance+deposit;
            System.out.println("The current amount is: " + balance);
         }
         else if(choice==3){
            System.out.println("Enter the money to be withdraw:");
            double withdrawal = sc.nextDouble();

            if(balance>=withdrawal){
                balance = balance -withdrawal;
                System.out.println("The withdraw is successfull of amount: " + withdrawal);
                System.out.println("The current amount is: " + balance);
            }
            else{
                System.out.println("Insufficent balance:");
            }
         }
         else{
            System.out.println("Invalid choice:");
         }

         sc.close();

    }
    
}
