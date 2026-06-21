package DAY21;

import java.util.Scanner;

public class VowelsAndConsonant {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string here:");
        str=sc.nextLine();

        int vowels = 0;
        int consonant=0;

        for(int i =0;i<str.length();i++){
              char ch = str.charAt(i);

              if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowels++;
                }
                else{
                    consonant++;
                }
              }
        }
        System.out.println("The total no.of vowels are:"+vowels);
        System.out.println("The total no.of consonants are:"+consonant);
       
        sc.close();
    
}
}   
