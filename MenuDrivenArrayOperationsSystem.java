
    import java.util.Scanner;

public class MenuDrivenArrayOperationsSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = null;
        int n = 0;
        int choice;

        do {
            System.out.println("\n===== MENU DRIVEN ARRAY OPERATIONS =====");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Find Maximum");
            System.out.println("5. Find Minimum");
            System.out.println("6. Find Sum");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter size of array: ");
                    n = sc.nextInt();
                    arr = new int[n];

                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("Please create the array first.");
                    } else {
                        System.out.print("Array Elements: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("Please create the array first.");
                    } else {
                        System.out.print("Enter element to search: ");
                        int key = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < n; i++) {
                            if (arr[i] == key) {
                                System.out.println("Element found at index " + i);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Element not found.");
                        }
                    }
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("Please create the array first.");
                    } else {
                        int max = arr[0];
                        for (int i = 1; i < n; i++) {
                            if (arr[i] > max) {
                                max = arr[i];
                            }
                        }
                        System.out.println("Maximum Element = " + max);
                    }
                    break;

                case 5:
                    if (arr == null) {
                        System.out.println("Please create the array first.");
                    } else {
                        int min = arr[0];
                        for (int i = 1; i < n; i++) {
                            if (arr[i] < min) {
                                min = arr[i];
                            }
                        }
                        System.out.println("Minimum Element = " + min);
                    }
                    break;

                case 6:
                    if (arr == null) {
                        System.out.println("Please create the array first.");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < n; i++) {
                            sum += arr[i];
                        }
                        System.out.println("Sum of Elements = " + sum);
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
    

