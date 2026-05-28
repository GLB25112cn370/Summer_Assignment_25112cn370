import java .util.Scanner;
public class CountDigit {
    public static void main(String[]args){
        int n;
        int count =0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scanner.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits in the given number is: " + count);
        scanner.close();
    }
    
}
