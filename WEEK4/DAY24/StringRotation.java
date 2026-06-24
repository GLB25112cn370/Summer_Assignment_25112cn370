package WEEK4.DAY24;
import java.util.Scanner;
public class StringRotation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the string 1:");
        String str1 = sc.nextLine();

         System.out.println("enter the string 2:");
        String str2 = sc.nextLine();
       
        String str = str1+str1;

       if(str1.length()==str2.length() && str.contains(str2) ){
        System.out.println("String is a rotation:");
       }
       else{
        System.out.println("String is a not rotation:");
       }
      sc.close();
    }
    
}
