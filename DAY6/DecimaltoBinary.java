package DAY6;

import java.util.Scanner;

public class DecimaltoBinary {
    
    static void DecimaltoBinary(int n){
        int t =n;
        String sum = "";
        
        while(t>0){
            int r = t%2;
            t = t/2;
            sum = r + sum;
            
        }
        System.out.println(sum);
    }
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the decimal number:");
        int num = in.nextInt();
        DecimaltoBinary(num);
        in.close();
    }
    
}
