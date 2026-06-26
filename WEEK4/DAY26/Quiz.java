package WEEK4.DAY26;
import java.util.Scanner;

public class Quiz {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println(" QUIZ");

        // Question 1
        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Kolkata");
        System.out.print("Enter your answer (a/b/c): ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Java programming?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        System.out.print("Enter your answer (a/b/c): ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'a' || ans2 == 'A') {
            score++;
        }

        // Question 3
        System.out.println("\n3. How many days are there in a week?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.print("Enter your answer (a/b/c): ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'c' || ans3 == 'C') {
            score++;
        }

        // Display Result
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else if (score == 1) {
            System.out.println("Average Performance.");
        } else {
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}
    

