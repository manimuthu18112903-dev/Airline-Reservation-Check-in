import jva.util.*;
class main{
public static void main(String[] args) {
        while (true) {
            System.out.println("\n====== AIRLINE RESERVATION SYSTEM ======");
            System.out.println("1. Add Flight");
            System.out.println("2. Add Passenger");
            System.out.println("3. Create Booking");
            System.out.println("4. Make Payment");
            System.out.println("5. Check-in & Issue Boarding Pass");
            System.out.println("6. Cancel Booking");
            System.out.println("7. Display Flights");
            System.out.println("8. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    addFlight();
                    break;
                case 2:
                    addPassenger();
                    break;
                case 3:
                    createBooking();
                    break;
                case 4:
                    makePayment();
                    break;
                case 5:
                    checkIn();
                    break;
                case 6:
                    cancelBooking();
                    break;
                case 7:
                    displayFlights();
                    break;
                case 8:
                    System.out.println("Thank you for using Airline Reservation System!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
