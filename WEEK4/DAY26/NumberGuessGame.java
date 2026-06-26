package WEEK4.DAY26;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int target = rnd.nextInt(100) + 1; // 1-100
        System.out.println("Guess a number between 1 and 100:");

        int trycount=0;
        while (true) {
            int guess = sc.nextInt();
            trycount++;
            if (guess < target) System.out.println("You gussed a lower number : guess again!");
            else if (guess > target) System.out.println("You guessed a higher number :guess again");
            else {
                System.out.println("Correct!You won" );
                 System.out.println("you make " + trycount +" tries" );
                break;
            }
        }
        sc.close();
    }
}

