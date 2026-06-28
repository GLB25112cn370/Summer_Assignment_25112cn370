package WEEK4.DAY28;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance        : " + balance);
        System.out.println("----------------------------");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {

            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Delete Account");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    accounts.add(new Account(accNo, name, balance));
                    System.out.println("Account Created Successfully.");
                    break;

                case 2:
                    if (accounts.isEmpty()) {
                        System.out.println("No Accounts Found.");
                    } else {
                        for (Account a : accounts) {
                            a.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Account a : accounts) {
                        if (a.accNo == search) {
                            a.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int dep = sc.nextInt();

                    found = false;

                    for (Account a : accounts) {
                        if (a.accNo == dep) {
                            System.out.print("Enter Deposit Amount: ");
                            double amount = sc.nextDouble();
                            a.balance += amount;
                            System.out.println("Amount Deposited Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    int wd = sc.nextInt();

                    found = false;

                    for (Account a : accounts) {
                        if (a.accNo == wd) {

                            System.out.print("Enter Withdraw Amount: ");
                            double amount = sc.nextDouble();

                            if (amount <= a.balance) {
                                a.balance -= amount;
                                System.out.println("Withdrawal Successful.");
                            } else {
                                System.out.println("Insufficient Balance.");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found.");
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    int del = sc.nextInt();

                    found = false;

                    for (Account a : accounts) {
                        if (a.accNo == del) {
                            accounts.remove(a);
                            System.out.println("Account Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found.");
                    break;

                case 7:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
