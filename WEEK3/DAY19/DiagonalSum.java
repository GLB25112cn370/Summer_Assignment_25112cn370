package DAY19;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows1,col1;
        
       
         System.out.println("Enter the number of rows in matrices 1:");
        rows1=sc.nextInt();

         System.out.println("Enter the number of columns in matrices 1:");
        col1=sc.nextInt();
              
        int[][]matrix = new int[rows1][col1];
    
              
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
              
                int sum =0;
                int n = matrix.length;
                // it is for square matrix

                for(int i =0;i<n;i++){
                    sum=sum + matrix[i][i];
                    sum=sum + matrix[i][n-i-1];
                }
                 
                if(n%2!=0)
                {
                    sum= sum-matrix[n/2][n/2];
                }
              
                           
         System.out.println("The sum of the diagonal element of matrix is:");
         System.out.println(sum);

                              
      sc.close();


    }
    
}
