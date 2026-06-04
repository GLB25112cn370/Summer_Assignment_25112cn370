package DAY3;
import java.util.Scanner;

public class ISPrime {
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
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = IsPrime(num);
        System.out.println(result);
        sc.close();
    }
}
