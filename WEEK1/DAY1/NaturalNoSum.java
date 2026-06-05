package DAY1;

import java.util.Scanner;

public class NaturalNoSum { 
    public static void main(String[]args){

    
    
    int n ;
        int sum =0;
        Scanner  scanner  = new Scanner(System.in);

        System.out.println(" Enter the number of terms");
        n = scanner .nextInt();
        for (int i =1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

    scanner.close();
    
}
}
