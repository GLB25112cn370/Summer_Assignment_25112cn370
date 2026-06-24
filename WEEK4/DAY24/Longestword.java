package WEEK4.DAY24;

import java.util.Scanner;

public class Longestword {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the string :");
        String str1 = sc.nextLine();
        str1 = str1 + " ";

        String word = "";
        int max = 0;
        String t = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > max) {
                    max = word.length();
                    t = word;
                }
                word = "";
            }
        }
       
        System.out.println("Longest word: " + t);
        sc.close();
    }
}
