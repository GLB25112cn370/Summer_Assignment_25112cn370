package DAY3;

import java.util.Scanner;

public class PrimeNoRange {
   
    static boolean IsPrime(int n){
        if(n<=1){
            return false;
        
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        return c*c>n;


    }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the starting num:");
        int startingnum =sc.nextInt();

        System.out.print("Enter a end number: ");
        int endnum = sc.nextInt();

        for(int i = startingnum;i<=endnum;i++){
            if(IsPrime(i)){
                System.out.println(i + "is a prime number");
            }
        }

         sc .close();
    }
         
     
    
}
