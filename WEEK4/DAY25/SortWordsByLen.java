package WEEK4.DAY25;

import java.util.Scanner;

public class SortWordsByLen {
      public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

          System.out.println("enter the string :");
        String str = sc.nextLine();

        String[]words= str.split(" ");

        for(int i =0;i<words.length-1;i++){
            for(int j =i+1;j<words.length;j++){
             if(words[i].length()>words[j].length()){
                String temp = words[i];
                words[i]=words[j];
                words[j]=temp;
             }
            }
        }

        System.out.println("Sorted words by length are:");
        for(String word:words){
            System.out.print(word +" ");
        }
    sc.close();
}
}
