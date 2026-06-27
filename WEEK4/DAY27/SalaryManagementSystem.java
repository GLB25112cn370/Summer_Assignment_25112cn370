package WEEK4.DAY27;

import java.util.ArrayList;
import java.util.Scanner;

class Salary {
    int empId;
    String name;
    double basicSalary;
    double bonus;
    double deduction;

    Salary(int empId, String name, double basicSalary, double bonus, double deduction) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    double netSalary() {
        return basicSalary + bonus - deduction;
    }

    void display() {
        System.out.println("------------------------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Deduction   : " + deduction);
        System.out.println("Net Salary  : " + netSalary());
    }
}

public class SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Salary> salaries = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Salary Record");
            System.out.println("4. Delete Salary Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();

                    System.out.print("Enter Bonus: ");
                    double bonus = sc.nextDouble();

                    System.out.print("Enter Deduction: ");
                    double deduction = sc.nextDouble();

                    salaries.add(new Salary(id, name, basic, bonus, deduction));
                    System.out.println("Salary Record Added Successfully.");
                    break;

                case 2:
                    if (salaries.isEmpty()) {
                        System.out.println("No salary records found.");
                    } else {
                        for (Salary s : salaries) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Salary s : salaries) {
                        if (s.empId == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Salary Record not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < salaries.size(); i++) {
                        if (salaries.get(i).empId == deleteId) {
                            salaries.remove(i);
                            found = true;
                            System.out.println("Salary Record Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Salary Record not found.");
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
