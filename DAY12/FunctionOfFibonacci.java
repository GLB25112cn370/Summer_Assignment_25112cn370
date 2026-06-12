package DAY12;

import java.util.Scanner;

public class FunctionOfFibonacci {
         static void Fibonacci(int num){
     int Sum=0;
        int prev, current;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter first num :");
        prev= sc.nextInt();

        System.out.println("Enter first num :");
        current = sc.nextInt();

        for(int i =0;i<=num;i++){
            System .out.println(prev);
            Sum= prev+current;
            prev=current;
            current=Sum;

        }

        sc.close();

    
    }
    
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        num= sc.nextInt();

         Fibonacci(num);

       
         
        sc.close();


    }
    
}

    

