import java.util.Scanner;

public class Table {
    public static void main(String[]args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number whose multiplication want to print ");
        number=scanner.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(number +"*"+ i+"="+number*i);
        }
        scanner.close();
    }
    
}
