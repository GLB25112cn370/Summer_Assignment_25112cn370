package DAY19;
import java.util.Scanner;

public class AdditionOfMatrices {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows1,rows2,col1,col2;
        
       
         System.out.println("Enter the number of rows in matrices 1:");
        rows1=sc.nextInt();

         System.out.println("Enter the number of rows in matrices 2:");
        rows2=sc.nextInt();

         System.out.println("Enter the number of columns in matrices 1:");
        col1=sc.nextInt();

        System.out.println("Enter the number of columns in matrices 2:");
        col2=sc.nextInt();

        if(rows1!=rows2||col1!=col2){
            System.out.println("The addition of matrices is not possible:");
        }
        else{
            int[][]matrix1 = new int[rows1][col1];
             int[][]matrix2 = new int[rows2][col2];
              int[][]summatrix = new int[rows1][col1];

              System.out.println("enter the value of matrix1:");

              for(int i = 0;i<rows1;i++){
                for(int j =0;j<col1;j++){
                    matrix1[i][j] = sc.nextInt();
                }
                 
              }
             System.out.println("enter the value of matrix2:");

              for(int i = 0;i<rows2;i++){
                for(int j =0;j<col2;j++){
                    matrix2[i][j] = sc.nextInt();
                }
                
              }

             
              for(int i = 0;i<rows1;i++){
                for(int j =0;j<col1;j++){
                   summatrix[i][j] = matrix1[i][j]+matrix2[i][j];
                }
              }

           System.out.println("The sum of both matrices is:");

              for(int i = 0;i<rows1;i++){
                for(int j =0;j<col1;j++){
                    System.out.print(summatrix[i][j]+" ");
                }
                System.out.println(" ");
              }
              
        }
      sc.close();


    }
    
}
