package WEEK4.DAY23;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[]args){        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of string1:");
        String S1 = sc.nextLine();
         System.out.println("Enter the value of string2:");
        String S2 = sc.nextLine();      
    
        S1 = S1.toLowerCase();
        S2 = S2.toLowerCase();

        char[]ch1=S1.toCharArray();
        char[]ch2=S2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
              System.out.println("These are anagram string.");
        }
        else{
            System.out.println("These are not anagram strings.");
        }

        sc.close();

      

    
}
}
