package DAY9;

import java.util.Scanner;

public class RepeatedCharacterPattern {
    public static void main(String[]args){

      int rows ;
      int columns;

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of rows:");
      int n = sc.nextInt();
       char ch ="A".charAt(0);
      for(rows=1;rows<=n;rows++){
       
        for(columns=1;columns<=rows;columns++){
            System.out.print(ch);
            
        }
        ch++;
        System.out.println();
      }

          sc.close();

      }

    
}
