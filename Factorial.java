import java .util.Scanner;
public class Factorial {
    public static void main(String[]args){
        int number;
        int factorial=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to calculate");
        number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
