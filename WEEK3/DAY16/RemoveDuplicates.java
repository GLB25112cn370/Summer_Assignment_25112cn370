package DAY16;

import java.util.Scanner;

public class RemoveDuplicates {
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
         int rd =0;
           for(int i = 1;i<arr.length;i++){
           if(arr[rd]!=arr[i]){
            rd++;
            arr[rd]=arr[i];
           }
            
         }
         System.out.println("The removed duplicate array is");
           for(int i = 0;i<=rd;i++){
           System.out.println(arr[i]);
        }

         sc.close();

    }



    
}
