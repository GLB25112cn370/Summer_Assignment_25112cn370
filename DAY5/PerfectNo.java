package DAY5;
import java.util.Scanner;
public class PerfectNo {
     static boolean IsPerfect( int n){
        if(n<0){
            return false;
        }
         int sum =0;
         for(int i = 1;i<n;i++){
            if(n%i==0){
                sum = sum+i;
            }
         }
         return sum==n;

    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

         System.out.println("Enter the number:");
        int num = in.nextInt();

        boolean ans = IsPerfect(num);
        System.out.println("Is perfect number:"+ans);
       in.close();

    }
    
}
