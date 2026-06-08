package DAY8;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[]args){
          int rows ;
      int columns;

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of rows:");
      int n = sc.nextInt();
      for(rows=1;rows<=n;rows++){
        for(columns=1;columns<=rows;columns++){
            System.out.print(columns);
        }
        System.out.println();
      }

          sc.close();

      }

    }
    

