package  DAY2;
import java.util.Scanner;
public class SUMOFDIGIT {
    public static void main (String[]args){
        int num ,rem;
        int sum=0;
        Scanner digit =new Scanner(System.in);
        System.out.println("Enter the number");
        num=digit.nextInt();
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.println("the sum of the digit of a number is:"+sum);
        digit.close();

    }
    
}
