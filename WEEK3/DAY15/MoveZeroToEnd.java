package DAY15;

import java.util.Scanner;

public class MoveZeroToEnd {
     static void ZeroMoveToEnd(int [] arr){
        int size = arr.length;
        if(size==0||size==1){
            return;
        }
        int nz=0;  // two pointers
        int z=0;
        while(nz<size){
        if(arr[nz]!=0){
            int temp = arr[nz];      
            arr[nz]=arr[z];
            arr[z]=temp;
            nz++;
            z++;

        }
        else{
            nz++;
        }
    }
    

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
            
          ZeroMoveToEnd(arr);
            for(int i = 0;i<arr.length;i++){
           
          System.out.println(arr[i]);

        }
         
         sc.close();
          
         }
          
          

    
}


    

