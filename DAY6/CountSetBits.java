package DAY6;

import java.util.Scanner;

public class CountSetBits {
    
    static void CountSetBits(int n){
       int count = 0;
       while(n>0){
        if((n&1)==1){
            count++;
        }
        n = n>>1;
       }
       System.out.println(count);
    }
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the number:");
        int num = in.nextInt();

        CountSetBits(num);
        in.close();
    }

    
}
