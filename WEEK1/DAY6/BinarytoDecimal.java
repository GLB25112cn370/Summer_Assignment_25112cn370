package DAY6;
import java.util.Scanner;

public class BinarytoDecimal {
    static void BinarytoDecimal(int n){
        int t =n;
        int sum =0;
        int i =0;
        while(t>0){
            int r = t%10;
            t = t/10;
            sum = sum + r * (int)Math.pow(2,i++);
            
        }
        System.out.println(sum);
    }
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the binary number:");
        int num = in.nextInt();
        BinarytoDecimal(num);
        in.close();
    }
}
