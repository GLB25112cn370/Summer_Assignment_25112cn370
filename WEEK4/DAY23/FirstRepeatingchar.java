package WEEK4.DAY23;

import java.util.Scanner;

public class FirstRepeatingchar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of string:");
        String input = sc.nextLine();
          input = input.toLowerCase();
      
        for(int i =0;i<input.length();i++){
            boolean repeating = false;
            for(int j =0;j<input.length();j++){
                if(i!=j  && input.charAt(i)==input.charAt(j)){
                    repeating = true;
                    break;
                }
            }
            if(repeating){
                System.out.println( "The first  repeating char is:"+input.charAt(i));
                break;
            }
        }
        sc.close();

    }
    
}
