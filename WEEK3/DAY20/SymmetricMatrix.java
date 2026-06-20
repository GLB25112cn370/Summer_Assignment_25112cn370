package DAY20;

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows1,col1;
        
       
         System.out.println("Enter the number of rows in matrices :");
        rows1=sc.nextInt();

         System.out.println("Enter the number of columns in matrices :");
        col1=sc.nextInt();
        if(rows1!=col1){
            System.out.println("The matrix is not symmetric");
        }
          else{  
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
              
              boolean symmetric = true;

              for(int i = 0;i<rows1;i++){
                for(int j =0;j<col1;j++){

                  if(  matrix[j][i]!=matrix[i][j]){
                    symmetric = false;
                    break;

                }
                
              }
            }
                           
             if(symmetric==true){
                System.out.println("The matrix is symmetric:");
             }
             else{
                 System.out.println("The matrix is not symmetric:");
             }
            }
           
        
      sc.close();


    }
    
}


