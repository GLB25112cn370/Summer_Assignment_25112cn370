package DAY12;

import java.util.Scanner;

public class FunctionOfPerfectNo {
      static boolean PerfectNo(int num){
     
     int Sum=0;
     for(int i=1;i<num;i++){
          
           if(num%i==0){
           Sum= Sum+i;
           }
     }
       
     if(num==Sum){
        return true;

     }
     else{
        return false;
     }
    }
    
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        num= sc.nextInt();

        boolean result= PerfectNo(num);

        System.out.println("The number is Perfectno. :"+ result);
         
        sc.close();


    }
    
}

    

