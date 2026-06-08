package DAY7;

import java.util.Scanner;

public class RecursiveSumOfDigit {
     static int SumOfDigit(int num){
        if(num==0){
            return 0;                // base condition
        }
        
        
        else{
            
            return (num % 10) + SumOfDigit(num / 10);   // recursive call

        }

    }

    public static void main(String[]args){
        int num ;
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose sum of digits to calculate:");
        num = in.nextInt();

        int result = SumOfDigit(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
        in .close();
    }
    
}
