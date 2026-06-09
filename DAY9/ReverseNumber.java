package DAY9;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]args){
          int rows ;
      int columns;

      Scanner in = new Scanner(System.in);

      System.out.println("Enter the number of rows:");
      int n = in.nextInt();
      for(rows=n;rows>=1;rows--){
        for(columns=1;columns<=rows;columns++){
            System.out.print(columns);
        }
        System.out.println();
      }

          in.close();

      }
    
}
