package DAY17;

import java.util.Scanner;

public class UnionOfArrays {
      public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array1:");
        int size1 = sc.nextInt();

        int[]arr=new int[size1];

          System.out.println("enter the size of array2:");
        int size2 = sc.nextInt();

         int[]arr2=new int[size2];

          
        int size3 = arr.length+arr2.length;

                 int[]union=new int[size3];
                 int k =0;

                 
        System.out.println("Enter the value of array1:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of array2:");

        for(int i = 0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        

        for(int i = 0;i<arr.length;i++){
            union[k++]=arr[i];
            
        }

         for(int i = 0;i<arr2.length;i++){
          boolean found = false;
           for(int j = 0;j<k;j++){
            if(arr2[i]==union[j]){
                found = true;
                break;
            }
        }
            if(!found){
                union[k++]=arr2[i];
            }
        }
         

         
           System.out.println("The value of the union arrays  :");
         for(int i = 0;i<k;i++){
            System.out.println(union[i]);
         }

         sc.close();
    }



    
}
