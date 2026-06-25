package WEEK4.DAY25;

import java.util.Scanner;

public class MergeTwoSortedArrays {
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

        int i =0;
        int j =0;
        int k =0;
        while(i<size1 && j<size2){
            if(arr[i]<=arr2[j]){
                arr3[k]=arr[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                 j++;
            }
            
           k++;
            
        }
        while(i<size1){
            arr3[k]=arr[i];
            i++;
            k++;
        }
        while(j<size2){
            arr3[k]=arr2[j];
            j++;
            k++;

        }
        System.out.println("Merged sorted arrays:");
        for(int num:arr3){
            System.out.println(num);
        }

        // if the array is String so Case 2 :
        String[]str1={"apple","banana","orange"};
        String[]str2={"grapes","pineapple"};

        String[]merged=new String[str1.length+str2.length];
          int m =0;
        int n =0;
        int o =0;
        while(i<str1.length && j<str2.length){
            if(str1[m].compareTo(str2[n])<=0){
                merged[o]=str1[m];
                m++;
            }
            else{
                merged[o]=str2[n];
                 n++;
            }
            
           o++;
            
        }
        while(m<str1.length){
            merged[o]=str1[m];
            m++;
            o++;
        }
        while(n<str2.length){
            merged[o]=str2[n];
            n++;
            o++;

        }
         System.out.println("Merged sorted arrays:");
        for(String str:merged){
            System.out.println(str);
        }
    sc.close();

}
}