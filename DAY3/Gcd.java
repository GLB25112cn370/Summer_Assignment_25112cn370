package DAY3;

import java.util.Scanner;

public class Gcd {
    static int Gcd(int a ,int b){
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.println("Enter the first number:");
        num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        num2 = sc .nextInt();

        int result=Gcd(num1,num2);
        System.out.println("The gcd of the two numbers is: " + result);
        sc.close();
    }
    
}
