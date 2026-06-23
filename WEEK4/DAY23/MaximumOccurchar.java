package WEEK4.DAY23;

import java.util.Scanner;

public class MaximumOccurchar {
    
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of string:");
        String input = sc.nextLine();
          input = input.toLowerCase();
      
        int maxcount=0;
        char maxchar = input.charAt(0);

        for(int i =0;i<input.length();i++){
            int count =0;
            for(int j =0;j<input.length();j++){
                  if(input.charAt(i)==input.charAt(j)){
                    count++;
                  }
            }
            if(count >maxcount){
                maxcount=count;
                maxchar=input.charAt(i);
            }
        }
        System.out.println("the maximum char freuency is: "+maxcount+" the char is"+ maxchar);
        sc.close();

    }
    
}
