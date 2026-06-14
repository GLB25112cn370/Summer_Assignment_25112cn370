package DAY14;

import java.util.Scanner;

public class LinearSearch {

    static int LinearSearching(int[] arr,int target){
       
        for (int i =0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int target;

        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of target element:");
        target = sc.nextInt();

        int ans = LinearSearching(arr,target);
        System.out.println("The element found at index :"+ans);


           

         sc.close();
    }
    
}
