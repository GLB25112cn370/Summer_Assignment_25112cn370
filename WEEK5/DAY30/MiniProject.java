package WEEK5.DAY30;

import java.util.Scanner;

public class MiniProject {

    static Scanner sc = new Scanner(System.in);

    static final int SIZE = 50;

    static int[] donorId = new int[SIZE];
    static String[] donorName = new String[SIZE];
    static String[] contact = new String[SIZE];
    static String[] donationType = new String[SIZE];
    static double[] amount = new double[SIZE];

    static int count = 0;

    public static void addDonor() {
        if (count == SIZE) {
            System.out.println("Database Full!");
            return;
        }

        System.out.print("Enter Donor ID: ");
        donorId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Donor Name: ");
        donorName[count] = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        contact[count] = sc.nextLine();

        System.out.print("Enter Donation Type (Cash/Food/Clothes/Books): ");
        donationType[count] = sc.nextLine();

        System.out.print("Enter Donation Amount: ");
        amount[count] = sc.nextDouble();

        count++;
        System.out.println("Donor Added Successfully!");
    }

    public static void displayDonors() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\n------ Donor Records ------");

        for (int i = 0; i < count; i++) {
            System.out.println("ID : " + donorId[i]);
            System.out.println("Name : " + donorName[i]);
            System.out.println("Contact : " + contact[i]);
            System.out.println("Type : " + donationType[i]);
            System.out.println("Amount : " + amount[i]);
            System.out.println("----------------------------");
        }
    }

    public static void searchDonor() {

        System.out.print("Enter Donor ID to Search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (donorId[i] == id) {
                System.out.println("Donor Found");
                System.out.println("Name : " + donorName[i]);
                System.out.println("Contact : " + contact[i]);
                System.out.println("Type : " + donationType[i]);
                System.out.println("Amount : " + amount[i]);
                return;
            }
        }

        System.out.println("Donor Not Found.");
    }

    public static void updateDonor() {

        System.out.print("Enter Donor ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (donorId[i] == id) {

                System.out.print("Enter New Name: ");
                donorName[i] = sc.nextLine();

                System.out.print("Enter New Contact: ");
                contact[i] = sc.nextLine();

                System.out.print("Enter New Donation Type: ");
                donationType[i] = sc.nextLine();

                System.out.print("Enter New Amount: ");
                amount[i] = sc.nextDouble();

                System.out.println("Record Updated Successfully!");
                return;
            }
        }

        System.out.println("Donor Not Found.");
    }

    public static void deleteDonor() {

        System.out.print("Enter Donor ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (donorId[i] == id) {

                for (int j = i; j < count - 1; j++) {
                    donorId[j] = donorId[j + 1];
                    donorName[j] = donorName[j + 1];
                    contact[j] = contact[j + 1];
                    donationType[j] = donationType[j + 1];
                    amount[j] = amount[j + 1];
                }

                count--;
                System.out.println("Record Deleted Successfully!");
                return;
            }
        }

        System.out.println("Donor Not Found.");
    }

    public static void totalDonation() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += amount[i];
        }

        System.out.println("Total Donation = " + total);
    }

    public static void highestDonation() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        int maxIndex = 0;

        for (int i = 1; i < count; i++) {
            if (amount[i] > amount[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Highest Donor");
        System.out.println("ID : " + donorId[maxIndex]);
        System.out.println("Name : " + donorName[maxIndex]);
        System.out.println("Amount : " + amount[maxIndex]);
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n====== Donation Management System ======");
            System.out.println("1. Add Donor");
            System.out.println("2. Display Donors");
            System.out.println("3. Search Donor");
            System.out.println("4. Update Donor");
            System.out.println("5. Delete Donor");
            System.out.println("6. Total Donation");
            System.out.println("7. Highest Donation");
            System.out.println("8. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addDonor();
                    break;

                case 2:
                    displayDonors();
                    break;

                case 3:
                    searchDonor();
                    break;

                case 4:
                    updateDonor();
                    break;

                case 5:
                    deleteDonor();
                    break;

                case 6:
                    totalDonation();
                    break;

                case 7:
                    highestDonation();
                    break;

                case 8:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);
    }
}
