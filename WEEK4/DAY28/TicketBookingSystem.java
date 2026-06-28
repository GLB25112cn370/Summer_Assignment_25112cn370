package WEEK4.DAY28;

import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    int ticketId;
    String passengerName;
    String destination;

    Ticket(int ticketId, String passengerName, String destination) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.destination = destination;
    }

    void display() {
        System.out.println("Ticket ID      : " + ticketId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Destination    : " + destination);
        System.out.println("----------------------------");
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();

        while (true) {

            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = sc.nextLine();

                    tickets.add(new Ticket(id, name, destination));
                    System.out.println("Ticket Booked Successfully.");
                    break;

                case 2:
                    if (tickets.isEmpty()) {
                        System.out.println("No Tickets Booked.");
                    } else {
                        for (Ticket t : tickets) {
                            t.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Ticket ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Ticket t : tickets) {
                        if (t.ticketId == search) {
                            t.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Ticket Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Ticket ID to Cancel: ");
                    int cancel = sc.nextInt();

                    found = false;

                    for (Ticket t : tickets) {
                        if (t.ticketId == cancel) {
                            tickets.remove(t);
                            System.out.println("Ticket Cancelled Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Ticket Not Found.");
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
