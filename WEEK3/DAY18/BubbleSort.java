package DAY18;

import java.util.Scanner;

public class BubbleSort {
    
    static void BubbleSorting(int[]arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

           System.out.println("The value of the arrays without sorting :");
         for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
         }

         BubbleSorting(arr);
          System.out.println("The value of the arrays after sorting :");
         for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
         }


         sc.close();
    }
}
