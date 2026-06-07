package DAY7;

import java.util.Scanner;

public class RecursiveFactorial {
     static int Factorial(int num){
        if(num==0||num==1){
            return 1;                // base condition
        }
        else{
            return num*Factorial(num-1);   // recursive call

        }

    }

    public static void main(String[]args){
        int num ;
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = in.nextInt();

        int result = Factorial(num);
        System.out.println("Factorial of "+ num+"is"+result);
        in .close();
    }
    
}
