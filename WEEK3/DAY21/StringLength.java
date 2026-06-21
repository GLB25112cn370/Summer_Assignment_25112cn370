package DAY21;
import java.util.Scanner;
public class StringLength {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string here:");
        str=sc.nextLine();
       
        char[]ch = str.toCharArray();
        int count=0;

        for(char c:ch){
            count++;
        }
         System.out.println("The length of string is:");
        System.out.println(count);

      sc.close();
    }
    
}
