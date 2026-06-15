package DAY15;

import java.util.Scanner;

public class RotateArrayRight {
     static void reverse(int [] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
      
    static void rotate(int[]arr,int k){  
      //   k = k%arr.length;
             // it is applicable to right rotate
             if(k<0){
            k = k +arr.length;
             }
       reverse(arr, 0,k-1);
       reverse(arr,k,arr.length-1);
       reverse(arr, 0, arr.length-1);
    }

    
     public static void main(String[]args){

        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of an array:");
              int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println("Enter the value no. of times you want to rotate:");
        int k = sc.nextInt();
          rotate(arr,k);
            for(int i = 0;i<arr.length;i++){
           
          System.out.println(arr[i]);

        }
         
         sc.close();
          
         }
          
          

    
}
