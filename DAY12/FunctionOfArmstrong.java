package DAY12;

import java.util.Scanner;

public class  FunctionOfArmstrong {
     static boolean Armstrong(int num){
     int count=0,rem;
     int Sum=0;
        int temp= num;
        while(num>0){
            num =num/10;
                 count++;
            
        }
     int num1=temp;
     while(temp>0){
        rem = temp%10;
         Sum= Sum + (int)Math.pow(rem,count);
         temp= temp/10;

     }
     if(num1==Sum){
        return true;

     }
     else{
        return false;
     }
    }
    
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        num= sc.nextInt();

        boolean result= Armstrong(num);

        System.out.println("The number is Palindrome :"+ result);
         
        sc.close();


    }
    
}
