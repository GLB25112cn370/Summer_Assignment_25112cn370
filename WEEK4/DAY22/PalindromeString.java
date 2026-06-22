package WEEK4.DAY22;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string here:");
        str=sc.nextLine();

        String rev ="";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev +str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("The string is palindrome:");
        }
        else{
            System.out.println("The string is not  palindrome:");

        }
       
    sc.close();

    }
    
}
  
