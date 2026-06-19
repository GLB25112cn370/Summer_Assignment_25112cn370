package DAY19;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows1,col1;
        
       
         System.out.println("Enter the number of rows in matrices 1:");
        rows1=sc.nextInt();

         System.out.println("Enter the number of columns in matrices 1:");
        col1=sc.nextInt();
              
        int[][]matrix = new int[rows1][col1];
        int[][]transpose = new int[rows1][col1];
              
        System.out.println("enter the value of matrix1:");

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
              
         

              for(int i = 0;i<rows1;i++){
                for(int j =0;j<col1;j++){
                    transpose[j][i] = matrix[i][j];
                }
                
              }

                           
           System.out.println("The transpose of matrix is:");

              for(int i = 0;i<col1;i++){
                for(int j =0;j<rows1;j++){
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println(" ");
              }
           
        
      sc.close();


    }
    
}
