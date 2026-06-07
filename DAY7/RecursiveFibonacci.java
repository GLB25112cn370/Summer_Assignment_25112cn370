package DAY7;

import java.util.Scanner;

public class RecursiveFibonacci {

     static int Fibonacci(int num){
        if(num==0){
            return 0;                // base condition
        }
        else if(num==1){
            return 1;
        }
        else{
            
            return  Fibonacci(num-1) + Fibonacci(num-2);   // recursive call

        }

    }

    public static void main(String[]args){
        int num ;
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose fibonacci series to print:");
        num = in.nextInt();

        for(int i =0;i<=num;i++){
            System.out.println(Fibonacci(i));
        }
        in .close();
    }
    
}
