package DAY13;

import java.util.Scanner;

public class SumAndAverageOfArray {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        double avg;
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }

           System.out.println("The sum and avg of an array:");

         for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
           
         }
          avg = (double)sum/arr.length;
          System.out.println("The sum of an array is :"+sum);
          System.out.println("The avg of an array is :"+avg);

         sc.close();
    }

    
}
