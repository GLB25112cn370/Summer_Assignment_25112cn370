package DAY5;

import java.util.Scanner;

public class StrongNo {
    static boolean IsStrongNo( int n){
        if(n<0){
            return false;
        }
         int sum =0;
         int factorial = 1;
         int temp =n;
         while(n>0){
            int rem = n%10;
           
            
         for(int i = 1;i<=rem;i++){
            factorial = factorial*i;
            }
            sum = sum+factorial;
            n = n/10;
            factorial = 1;
         } 

        
         return sum==temp;

    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

         System.out.println("Enter the number:");
        int num = in.nextInt();

        boolean ans = IsStrongNo(num);
        System.out.println("Is strong number:"+ans);
       in.close();

    }
    

    
}
