package DAY10;

import java.util.Scanner;

public class StarPyramid {
    
    public static void main(String[]args){
          int rows ;
      int columns;

      Scanner in = new Scanner(System.in);

      System.out.println("Enter the number of rows:");
      int n = in.nextInt();
      for(rows=1;rows<=n;rows++){
        for(int space =1;space<=n-rows;space++){
            System.out.print(" ");
        }
        for(columns=1;columns<=2*rows-1;columns++){

            System.out.print("*");
        }
        System.out.println();
    }
          in.close();

      }
     
      
          
      }

