package DAY12;
import java .util.Scanner;
public class FunctionOfPalindrome {
    static boolean Palindrome(int num){
        int rev=0,rem;
        int temp= num;
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num= num/10;
        }
         if(temp==rev){
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

        boolean result= Palindrome(num);

        System.out.println("The number is Palindrome :"+ result);
         
        sc.close();


    }
}
