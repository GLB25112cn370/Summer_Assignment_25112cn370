package WEEK5.DAY30;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int[] bookId = new int[max];
        String[] bookName = new String[max];
        String[] author = new String[max];
        boolean[] issued = new boolean[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < max) {
                        System.out.print("Enter Book ID: ");
                        bookId[count] = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        bookName[count] = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        author[count] = sc.nextLine();

                        issued[count] = false;
                        count++;

                        System.out.println("Book Added Successfully.");
                    } else {
                        System.out.println("Library is Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\nID\tBook Name\tAuthor\t\tStatus");
                        for (int i = 0; i < count; i++) {
                            System.out.println(bookId[i] + "\t" + bookName[i] + "\t\t" +
                                    author[i] + "\t\t" +
                                    (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == search) {
                            System.out.println("Book Found");
                            System.out.println("Book ID : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issue = sc.nextInt();
                    boolean issueFound = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issue) {
                            issueFound = true;

                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book Already Issued.");
                            }
                            break;
                        }
                    }

                    if (!issueFound)
                        System.out.println("Book Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int ret = sc.nextInt();
                    boolean returnFound = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == ret) {
                            returnFound = true;

                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully.");
                            } else {
                                System.out.println("Book is Already Available.");
                            }
                            break;
                        }
                    }

                    if (!returnFound)
                        System.out.println("Book Not Found.");
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
