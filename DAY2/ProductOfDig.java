package DAY2;

import java.util.Scanner;


public class ProductOfDig {
    public static void main (String[]args){
        int num ,rem;
        int product = 1;
        Scanner digit =new Scanner(System.in);
        System.out.println("Enter the number");
        num=digit.nextInt();
        while(num>0){
            rem=num%10;
            product=product*rem;
            num=num/10;

        }
        System.out.println("the product of the digits of a number is:"+product);
        digit.close();

    }
    
}
    

