package WEEK5.DAY30;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int[] empId = new int[max];
        String[] empName = new String[max];
        String[] department = new String[max];
        double[] salary = new double[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < max) {
                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();

                        System.out.print("Enter Department: ");
                        department[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();

                        count++;
                        System.out.println("Employee Added Successfully.");
                    } else {
                        System.out.println("Employee List is Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {
                        System.out.println("\nID\tName\t\tDepartment\tSalary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(empId[i] + "\t" + empName[i] + "\t\t"
                                    + department[i] + "\t\t" + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("Employee Found");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Department: " + department[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == updateId) {

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            empName[i] = sc.nextLine();

                            System.out.print("Enter New Department: ");
                            department[i] = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();

                            updated = true;
                            System.out.println("Employee Record Updated Successfully.");
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Employee Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                department[j] = department[j + 1];
                                salary[j] = salary[j + 1];
                            }

                            count--;
                            deleted = true;
                            System.out.println("Employee Deleted Successfully.");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Employee Not Found.");
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
