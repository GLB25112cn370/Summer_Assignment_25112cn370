package DAY10;

import java.util.Scanner;

public class NumberPyramid {
     public static void main(String[]args){
          int rows ;
     
      Scanner in = new Scanner(System.in);

      System.out.println("Enter the number of rows:");
      int n = in.nextInt();
      for(rows=1;rows<=n;rows++){
        for(int space =1;space<=n-rows;space++){
            System.out.print(" ");
        }

        for(int j =1;j<=rows;j++){
            System.out.print(j);
        }
                
        for(int j=rows-1;j>=1;j--){

            System.out.print(j);
        }
         
        System.out.println();
    }
          in.close();

      }
     
    
}
