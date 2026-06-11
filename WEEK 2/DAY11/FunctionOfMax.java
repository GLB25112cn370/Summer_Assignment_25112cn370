package DAY11;

import java.util.Scanner;

public class FunctionOfMax {
     static int Max(int a,int b){
       if(a>b){
        return a;
       }
       else{
        return b ;
       }

    } 
    public static void main(String[]args){
        int num1,num2;
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        num1=sc.nextInt();

         System.out.println("Enter the second number");
        num2=sc.nextInt();

        result = Max(num1,num2);
        System.out.println("The maximum of two number is:"+ result);

        sc.close();

    }
    
}
