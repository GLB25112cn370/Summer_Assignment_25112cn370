package WEEK4.DAY27;

import java.util.ArrayList;
import java.util.Scanner;

class Students {
    int rollNo;
    String name;
    int m1, m2, m3;

    Students(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }

    double percentage() {
        return total() / 3.0;
    }

    String grade() {
        double per = percentage();

        if (per >= 90)
            return "A+";
        else if (per >= 80)
            return "A";
        else if (per >= 70)
            return "B";
        else if (per >= 60)
            return "C";
        else if (per >= 50)
            return "D";
        else
            return "Fail";
    }

    void display() {
        System.out.println("-------------------------------");
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Subject 1  : " + m1);
        System.out.println("Subject 2  : " + m2);
        System.out.println("Subject 3  : " + m3);
        System.out.println("Total      : " + total());
        System.out.println("Percentage : " + percentage());
        System.out.println("Grade      : " + grade());
    }
}

public class MarksheetGenerationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Marksheet Generation System =====");
            System.out.println("1. Add Student Marks");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search Marksheet");
            System.out.println("4. Delete Marksheet");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks of Subject 1: ");
                    int m1 = sc.nextInt();

                    System.out.print("Enter Marks of Subject 2: ");
                    int m2 = sc.nextInt();

                    System.out.print("Enter Marks of Subject 3: ");
                    int m3 = sc.nextInt();

                    students.add(new Students(roll, name, m1, m2, m3));
                    System.out.println("Marksheet Added Successfully.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Students s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Students s : students) {
                        if (s.rollNo == searchRoll) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = sc.nextInt();
                    found = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).rollNo == deleteRoll) {
                            students.remove(i);
                            found = true;
                            System.out.println("Marksheet Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}