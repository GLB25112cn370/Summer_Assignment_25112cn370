package DAY13;

import java.util.Scanner;

public class LargestAndSmallestNo {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int largest = arr[0];
        int smallest =arr[0];

           
         for(int i = 0;i<arr.length;i++){
           if(largest<arr[i]){
            largest = arr[i];
           }
           if(smallest>arr[i]){
            smallest= arr[i];
           }
         }

         System.out.println("The largest one is :"+largest);
         System.out.println("The smallest one is :"+smallest);
         

         sc.close();
    }

    
}
