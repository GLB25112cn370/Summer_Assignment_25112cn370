package DAY14;

import java.util.Scanner;

public class FrequencyOfElement {

    static int Frequency(int[] arr,int target){

        int count =0;
       
        for (int i =0;i<arr.length;i++){
            if(target==arr[i]){
                count++;
                
            }


        }
        return count ;
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

        int ans = Frequency(arr,target);
        System.out.println("The frequency of target element is :"+ans);


           

         sc.close();
    }
    

    
}
    
