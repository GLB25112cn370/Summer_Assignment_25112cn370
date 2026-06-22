package WEEK4.DAY22;

import java.util.Scanner;

public class WordsCount {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string here:");
        str=sc.nextLine();

        int count = 1;
        for(int i =0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            char d = str.charAt(i+1);
            if(ch ==' ' && d!=' '){
                 count++;
            }
            
        }
        System.out.println("The count of words in sentence are:"+count);
    
    sc.close();
}
}
