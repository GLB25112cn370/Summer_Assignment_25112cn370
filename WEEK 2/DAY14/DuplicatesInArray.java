package DAY14;

import java.util.Scanner;

public class DuplicatesInArray {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

         for(int i =0 ;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate element is :" +arr[i]);
                    break;
                }
            }
         }


           

         sc.close();
    }
    
}


    

