package DAY11;

import java.util.Scanner;

public class FunctionOfPrime {
     static boolean Prime(int n){

        if(n<=1){
            return false;
        }
         int c =2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
}
            return c*c>n;
                
            
        

       

    } 
    public static void main(String[]args){
        int num1;
        boolean result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number");
        num1=sc.nextInt();

        

        result = Prime(num1);
        System.out.println("The number is prime:"+ result);

        sc.close();

    }
    
}
