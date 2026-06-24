package WEEK4.DAY24;

import java.util.Scanner;

public class Removeduplicatechar {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string here:");
        str=sc.nextLine();
         
        String printedsofar= "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if( printedsofar.indexOf(ch)==-1){
               printedsofar = printedsofar + ch ;                        
        }
        
            }
            System.out.println("the string after duplicate removal is: " + printedsofar);
            sc.close();
        }
      
    
}
