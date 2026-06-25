package WEEK4.DAY25;

import java.util.Scanner;

public class CommonChar {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the string 1:");
        String str1 = sc.nextLine();

         System.out.println("enter the string 2:");
        String str2 = sc.nextLine();
       
        for(int i =0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch) !=-1){
                System.out.println("The common char is : " + ch +" ");
            }
        }
        sc.close();
    }
    
}
