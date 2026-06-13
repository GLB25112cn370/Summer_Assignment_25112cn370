package DAY13;
import java .util.Scanner;
public class Array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

           System.out.println("The value of the arrays :");
         for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
         }

         sc.close();
    }
}
