package DAY20;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows1,col1;
        
       
         System.out.println("Enter the number of rows in matrices :");
        rows1=sc.nextInt();

         System.out.println("Enter the number of columns in matrices :");
        col1=sc.nextInt();
       
          
        int[][]matrix = new int[rows1][col1];
        
              
        System.out.println("enter the value of matrix:");

         for(int i = 0;i<rows1;i++){
                for(int j =0;j<col1;j++){
                    matrix[i][j] = sc.nextInt();
                }
                 
              }
               System.out.println("The  matrix is:");

              for(int i = 0;i<rows1;i++){
                for(int j =0;j<col1;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println(" ");
              }

             System.out.println("The rowwise sum of matrix is:");


              for(int i = 0;i<rows1;i++){
                  int rsum=0;
                for(int j =0;j<col1;j++){
                   rsum = rsum + matrix[i][j];
                }
                System.out.print(rsum+" ");
              }
              
             
        
      sc.close();


    }
    
}



    

