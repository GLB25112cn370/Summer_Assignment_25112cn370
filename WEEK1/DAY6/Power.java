package DAY6;
import java.util.Scanner;

public class Power {
    static void Power(int num,int power){
        int product = 1;
        int sum = 0;
        for(int i = 1;i<=power;i++){
             product = product*num;
        }
        System.out.println(product);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num =sc.nextInt();

        System.out.println("Enter the power:");
        int power = sc.nextInt();

        Power(num,power);
        sc.close();
    }
    
}
