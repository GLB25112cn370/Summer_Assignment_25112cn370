package WEEK4.DAY25;
import java.util.Scanner;
public class SortNames {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the no. of names");
        int names = sc.nextInt();
        sc.nextLine(); 

        String[] str = new String[names];

        System.out.println("Enter the names in array of string:");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareToIgnoreCase(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Sorted names:");
        for (String s : str) {
            System.out.println(s);
        }
        sc.close();
    }
    
}
