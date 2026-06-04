package Day2;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int product = 1;
        int rem;
        while (num > 0) {
           rem = num%10;
           product=product *rem;
           num=num/10;
            
        }
        System.out.println("Product of digits: " + product);
        sc.close();
    }
    
}
