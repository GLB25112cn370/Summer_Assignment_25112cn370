package DAY21;

import java.util.Scanner;

public class LowerCaseToUpperCase {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string here:");
        str=sc.nextLine();

        boolean valid = true;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                valid=false;
                break;
            }
        }
        if(!valid){
            System.out.println("The string is not inputted in lower case");

        }
        else{
            String upper = "";
             for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                 upper =upper + (char)(ch-32);
                                 
                }

             else{
                upper = upper + ch;
             }   
        }
        System.out.println("The uppercase is:"+upper);

    sc.close();
}
}
}
