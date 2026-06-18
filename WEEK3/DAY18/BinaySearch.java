package DAY18;

import java.util.Scanner;

public class BinaySearch {
    // binary search only applicable to the sorted arrays.
    static int BinarySearching(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
             else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
       return -1;

    }
    // it is applicable if the array is unsorted
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
                
         
         BubbleSorting(arr);
          System.out.println("The value of the arrays after sorting :");
         for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
          
         System.out.println("Enter the value of a target:");
           
         int target = sc.nextInt();

         int ans = BinarySearching(arr, target);

          System.out.println("The value of the target element present at index:" + ans);
      


         sc.close();
    }
}
