package DAY5;

import java.util.Scanner;

public class LargestPrimeFactor {
     static void LargestPrimeFactor( int n){
        int max =0;
        if(n<0){
            System.out.println("Invalid input");
            
        }
         for(int i =1;i<=n;i++){
            if(n%i==0){
                int c = 2;
                while(c*c<=i){
                    if(i%c==0){
                        break;
                    }
                        c++; 
                }
                    if(c*c>i){
                        max=i;
                    }
                }
              
        
                }
                
                System.out.println(max);
            
            }
           
         

    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

         System.out.println("Enter the number:");
        int num = in.nextInt();

        System .out.println(" Largest Prime Factors of "+ num+ ":");

        LargestPrimeFactor(num);
       in.close();
    
    
}
}
