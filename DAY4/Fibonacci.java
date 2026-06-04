package DAY4;
import java.util.Scanner;
public class Fibonacci{
    static void Fibonacci(int n){
        int firstterm = 0;
        int secondterm= 1;
        if(n==0){
            System.out.println(firstterm);
            
        }
        else if(n==1){
            System.out.println(secondterm);
            
        }
        else{
            for(int i =2;i<=n;i++){
                System.out.println(firstterm);
                int nextterm = firstterm+secondterm;
                firstterm=secondterm;
                secondterm=nextterm;
            }
        }
        System.out.println();
        }

    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int numberofterms = sc.nextInt();

        Fibonacci(numberofterms);

        sc.close();

    }
}
