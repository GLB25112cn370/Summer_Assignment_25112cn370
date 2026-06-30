package WEEK5.DAY30;

import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int[] roll = new int[max];
        String[] name = new String[max];
        int[] marks = new int[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < max) {
                        System.out.print("Enter Roll Number: ");
                        roll[count] = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextInt();

                        count++;
                        System.out.println("Student Record Added Successfully.");
                    } else {
                        System.out.println("Record is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {
                        System.out.println("\nRoll\tName\t\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == searchRoll) {
                            System.out.println("Record Found:");
                            System.out.println("Roll: " + roll[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = sc.nextInt();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == updateRoll) {
                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();

                            System.out.println("Record Updated Successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == deleteRoll) {

                            for (int j = i; j < count - 1; j++) {
                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                marks[j] = marks[j + 1];
                            }

                            count--;
                            deleted = true;
                            System.out.println("Record Deleted Successfully.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
