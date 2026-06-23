package WEEK4.DAY23;
import java.util.Scanner;

public class FirstNonRepeatingchar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of string:");
        String input = sc.nextLine();
          input = input.toLowerCase();
      
        for(int i =0;i<input.length();i++){
            boolean unique = true;
            for(int j =0;j<input.length();j++){
                if(i!=j  && input.charAt(i)==input.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.println( "The first non repeating char is:"+input.charAt(i));
                break;
            }
        }
        sc.close();

    }
    
}
