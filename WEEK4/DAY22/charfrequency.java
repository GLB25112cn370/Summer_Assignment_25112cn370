package WEEK4.DAY22;

import java.util.Scanner;

public class charfrequency {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string here:");
        str=sc.nextLine();
         
        String printedsofar= "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if( printedsofar.indexOf(ch)==-1){
                int count =0;
            for(int j = 0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
             System.out.println("The count of character "+ ch +"is: "+count);
           printedsofar = printedsofar + ch ;
        }
        
            }
            sc.close();
        }
      
    
}
