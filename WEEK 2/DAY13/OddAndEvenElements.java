package DAY13;

import java.util.Scanner;

public class OddAndEvenElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        

        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            for(int i = 0;i<arr.length;i++){
        if(arr[i] %2==0){
            even++;

        }
        else{
            odd++;
        }
    }
         
        System.out.println("The no.of even elements :"+even);
          System.out.println("The no.of odd elements :"+odd);

       

         sc.close();
    
}
}
    

