import java.util.*;
import java.io.*;

public class EventManagementSystem {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("       EVENT MANAGEMENT SYSTEM");
        System.out.println("============================================");
        boolean running = true;
        while (running) {
            System.out.println("\n1. View Events\n2. View Fee Structure\n3. Calculate Package Price\n4. Register Participant\n5. Create Booking\n6. View Sample Report\n0. Exit");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": EventManager.displayEvents(); break;
                case "2": FeeManager.displayFees(); break;
                case "3": calculatePrice(); break;
                case "4": registerParticipant(); break;
                case "5": createBooking(); break;
                case "6": ReportGenerator.displaySummary(); break;
                case "0": running = false; System.out.println("Thank you for using Event Management System!"); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void calculatePrice() {
        EventManager.displayEvents();
        System.out.print("Enter event type exactly as shown: "); String event = sc.nextLine().trim();
        FeeManager.displayPackages(event);
        System.out.print("Enter package (Basic/Standard/Premium): "); String pkg = sc.nextLine().trim();
        System.out.print("Enter discount percentage (0-100): ");
        try {
            double discount = Double.parseDouble(sc.nextLine().trim());
            if (!Validation.validDiscount(discount)) { System.out.println("Discount must be between 0 and 100."); return; }
            double base = PriceCalculator.getBasePrice(event, pkg);
            if (base < 0) { System.out.println("Event or package not found."); return; }
            PriceCalculator.printPriceBreakdown(base, discount);
        } catch (NumberFormatException ex) { System.out.println("Please enter a valid number."); }
    }
    private static void registerParticipant() {
        System.out.print("Participant name: "); String name = sc.nextLine().trim();
        System.out.print("Email: "); String email = sc.nextLine().trim();
        System.out.print("Phone: "); String phone = sc.nextLine().trim();
        if (!Validation.validName(name) || !Validation.validEmail(email) || !Validation.validPhone(phone)) {
            System.out.println("Invalid details. Check name, email and phone number."); return;
        }
        Participant p = new Participant(name, email, phone);
        FileHandler.append("data/participants.txt", p.toFileLine());
        System.out.println("Participant registered successfully. ID: " + p.getId());
    }
    private static void createBooking() {
        System.out.print("Customer name: "); String name = sc.nextLine().trim();
        System.out.print("Event type: "); String event = sc.nextLine().trim();
        System.out.print("Package (Basic/Standard/Premium): "); String pkg = sc.nextLine().trim();
        double base = PriceCalculator.getBasePrice(event, pkg);
        if (base < 0 || name.isEmpty()) { System.out.println("Invalid name, event or package."); return; }
        Booking booking = new Booking(name, event, pkg, base);
        FileHandler.append("data/bookings.txt", booking.toFileLine());
        Ticket ticket = TicketGenerator.generate(booking);
        FileHandler.append("data/tickets.txt", ticket.toFileLine());
        Bill bill = new Bill(booking, 0);
        FileHandler.append("data/bills.txt", bill.toFileLine());
        System.out.println("Booking created successfully!");
        System.out.println(ticket);
        System.out.println(bill);
    }
}
