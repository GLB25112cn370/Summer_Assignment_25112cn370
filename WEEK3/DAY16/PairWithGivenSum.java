package DAY16;

import java.util.Scanner;

public class PairWithGivenSum {
     public static void main(String[]args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

           System.out.println("The value of the target sum :");
            int sum = sc.nextInt();

            for( int i=0;i<arr.length;i++){
                for(int j =i+1;j<arr.length;j++){
                
                if(arr[i]+arr[j]==sum){
                    count++;
                    System.out.println("The pair found are:"+arr[i]+"and"+arr[j]);
                }

            }

            }
         sc.close();
    }

    
}
