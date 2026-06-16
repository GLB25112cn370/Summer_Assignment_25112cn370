package DAY16;

import java.util.Scanner;

public class MissingNo {
    public static void main(String[]args){
        int sum1=0;
        int sum2=0;
        Scanner sc = new Scanner(System.in);
       
               System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size-1];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
         
                          
         System.out.println("The sum of elements of an array:");
    
         for(int i = 0;i<arr.length;i++){
             sum1=sum1+arr[i];
         }
          System.out.println(sum1);
           System.out.println("The sum of elements of a range:");
         
          for(int i = 1;i<=size;i++){
             sum2=sum2+i;
         }
          System.out.println(sum2);

         System.out.println("The missing number is :" + ( sum2-sum1));


         sc.close();

    
}
}
