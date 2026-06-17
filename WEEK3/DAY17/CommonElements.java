package DAY17;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array1:");
        int size1 = sc.nextInt();

        int[]arr=new int[size1];

          System.out.println("enter the size of array2:");
        int size2 = sc.nextInt();

         int[]arr2=new int[size2];

          
      
                 
        System.out.println("Enter the value of array1:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of array2:");

        for(int i = 0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
            

        System.out.println("The common elements are:");
        

        for(int i = 0;i<arr.length;i++){
            boolean alreadypresent=false;
            for(int k =0;k<i;k++){
               if( arr[i]==arr[k]){
                alreadypresent=true;
                break;
               }

            }

            if(alreadypresent)
                continue;

            for(int j = 0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    
                    System.out.println(arr[i]+" ");
                    
                }
                
           
          
            
        }
        
            
        }

                 

         sc.close();
    }


    
}


    



    

