package DAY17;

import java.util.Scanner;

public class MergeArrays {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array1:");
        int size1 = sc.nextInt();

        int[]arr=new int[size1];

          System.out.println("enter the size of array2:");
        int size2 = sc.nextInt();

         int[]arr2=new int[size2];

          
        int size3 = arr.length+arr2.length;

                 int[]arr3=new int[size3];

                 
        System.out.println("Enter the value of array1:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of array2:");

        for(int i = 0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        

        for(int i = 0;i<arr.length;i++){
            arr3[i]=arr[i];
            
        }

         for(int i = 0;i<arr2.length;i++){
            arr3[i+arr.length]=arr2[i];
            
        }

         
           System.out.println("The value of the merged  :");
         for(int i = 0;i<arr3.length;i++){
            System.out.println(arr3[i]);
         }

         sc.close();
    }


    
}
