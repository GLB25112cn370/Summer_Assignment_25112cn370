package WEEK4.DAY26;
import java .util.Scanner;

public class VotingEligiblity {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Are you Indian citizen:(Yes/no)");

        String citizen= sc.nextLine();

        if(age>=18 && citizen.equalsIgnoreCase("yes")){
            System.out.println("Hello" + name);
            System.out.println("You are eligible for vote:");
        }
        else{
             System.out.println("Hello" + name);
            System.out.println("You are not eligible for vote:");
        }
        sc.close();
    }
    
}
