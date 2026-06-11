package DAY11;
import java.util.Scanner;
public class FunctionOfSum {
    static int Sum(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;

    } 
    public static void main(String[]args){
        int num1,num2;
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        num1=sc.nextInt();

         System.out.println("Enter the second number");
        num2=sc.nextInt();

        result = Sum(num1,num2);
        System.out.println("The sum of two number is:"+ result);

        sc.close();

    }
    
}
