package DAY11;

import java.util.Scanner;

public class FunctionOfFactorial {
     static int Factorial(int n){
        int fact =1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }

        return fact;
        
    } 
    public static void main(String[]args){
        int num1;
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number");
        num1=sc.nextInt();

              result = Factorial(num1);
        System.out.println("The factorial of number is:"+ result);

        sc.close();

    }
    
}
