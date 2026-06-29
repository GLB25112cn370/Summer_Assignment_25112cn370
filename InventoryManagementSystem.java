
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Product ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Price      : " + price);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.add(new Product(id, name, quantity, price));
                    System.out.println("Product Added Successfully!");
                    break;

                case 2:
                    if (inventory.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        for (Product p : inventory) {
                            p.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Product p : inventory) {
                        if (p.id == searchId) {
                            p.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();
                    Product removeProduct = null;

                    for (Product p : inventory) {
                        if (p.id == deleteId) {
                            removeProduct = p;
                            break;
                        }
                    }

                    if (removeProduct != null) {
                        inventory.remove(removeProduct);
                        System.out.println("Product Deleted Successfully!");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}