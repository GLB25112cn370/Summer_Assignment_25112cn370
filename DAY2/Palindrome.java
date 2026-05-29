package DAY2;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[]args){
        int num ,rem ,num1;
        int rev=0;
        Scanner digit =new Scanner(System.in);
        System.out.println("Enter the number");
        num=digit.nextInt();
        num1=num;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }

        if(num1==rev){
            System.out.println("The number is a palindrome.");
        } 
        else {
            System.out.println("The number is not a palindrome.");
        }
        digit.close();

    }
    
}
    

