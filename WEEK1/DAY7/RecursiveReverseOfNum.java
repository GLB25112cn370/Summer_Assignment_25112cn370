package DAY7;

import java.util.Scanner;

public class RecursiveReverseOfNum {
     static int revrsenum=0;
    static int ReverseOfNum(int num){
        
        if(num==0){
            return revrsenum;                // base condition
        }
        
        
        else{
            revrsenum=revrsenum*10 + num%10;
            
            return ReverseOfNum(num / 10);   // recursive call

        }

    }

    public static void main(String[]args){
        int num ;
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = in.nextInt();

        int result = ReverseOfNum(num);
        System.out.println("Reverse of " + num + " is: " + result);
        in .close();
    }

    
}
