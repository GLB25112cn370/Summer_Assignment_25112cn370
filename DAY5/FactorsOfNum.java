package DAY5;

import java.util.Scanner;

public class FactorsOfNum {
    static void Factor( int n){
        if(n<0){
            System.out.println("Invalid input");
            
        }
         for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.println(i + " ");
            }
         }

    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

         System.out.println("Enter the number:");
        int num = in.nextInt();

        System .out.println("Factors of "+ num+ ":");

        Factor(num);
       in.close();

    }
    
    
    
}
