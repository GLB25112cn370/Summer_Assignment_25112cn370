package DAY2;

import java.util.Scanner;

public class ReverseOfNum {
     public static void main (String[]args){
        int num ,rem;
        int rev=0;
        Scanner digit =new Scanner(System.in);
        System.out.println("Enter the number");
        num=digit.nextInt();
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println("the reverse of a number is:"+rev);
        digit.close();

    }
    
}

    

