package DAY4;

import java.util.Scanner;

public class Armstrong {
    static boolean IsArmstrong(int n){
        int count = 0;
        int sum =0;
        if(n<0){
            System.out.println("Negative numbers cannot be Armstrong numbers");
            return false;
        }
            

            else{
                int num = n;
                while(n>0){
                    n=n/10;
                    count++;
                }
                int temp =num;
                while(num>0){
                    int rem = num%10;
                    sum= sum+(int)Math.pow(rem,count);
                    num=num/10;

                }
                if(temp==sum){
                    
                    return true;
                }
                else{
                   
                    return false;
                }

            }
        }

    
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

       boolean result = IsArmstrong(number);
       System.out.println(result);
        
        sc.close();

    }
    
}
