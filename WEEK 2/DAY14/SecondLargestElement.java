package DAY14;

import java.util.Scanner;

public class SecondLargestElement {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
      
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

         int max1 = arr[0];
         int max2=arr[1];
         if (arr[0]>arr[1]){
            max1 = arr[0];
            max2= arr[1];
        
         }
         else{
            max1= arr[1];
            max2 = arr[0];
         }

          for(int i = 2;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1=arr[i];

            }
           else if(arr[i]>max2){
                max2 =arr[i];
            }
            
          
        }

          System.out.println("The second largest element is " + max2);
                

         sc.close();
    }


    
}
