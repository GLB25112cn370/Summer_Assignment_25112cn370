package WEEK4.DAY24;

import java.util.Scanner;

public class CompressString {

    public static  String compressString (String str){

          
        StringBuilder sc = new StringBuilder();
       
        int count =1;
        for(int i =0;i<str.length()-1;i++){
           
           if(str.charAt(i)==str.charAt(i+1)){
               count++;
           }
           else{
                 sc.append(str.charAt(i));
              if(count>1){
                sc.append(count);
              }
              count = 1;
           }
          
        }
        return sc.toString();
        
    }

     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the string :");
        String str1 = sc.nextLine();
      
        String result = compressString(str1) ;
        System.out.println(result);
         
      sc.close();
    }
}
