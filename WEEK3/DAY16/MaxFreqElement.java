package DAY16;

import java.util.Scanner;

public class MaxFreqElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        int[]arr=new int[size];

        System.out.println("Enter the value of array:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

         int maxfreq=0;
         int maxfreqelement=arr[0];
         for(int i = 0;i<arr.length;i++){
            int count =1;
          for(int j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
                count++;
            }

          }
          if (count>maxfreq){
            maxfreq= count;
            maxfreqelement=arr[i];
          }
         }
         System.out.println("THE MOST FREQUENT ELEMENT IS "+maxfreqelement+" ans the freq is "+maxfreq);

         sc.close();
    }

    
}
