package Parking_Lot_Management.src.main;

public class Main {
    public static void main(String[] args) {
        // Create objects of derived classes
        ParkingUser attendant = new ParkingAttendant("John Doe", 101, "Night");
        ParkingUser customer = new Customer("Jane Smith", 202, "CAR001");

        // Display information for each user
        System.out.println("Parking User Details:");
        attendant.displayInfo();
        System.out.println();
        customer.displayInfo();

        // Demonstrate virtual function at runtime
        System.out.println("\nRoles in the Parking System:");
        System.out.println("Attendant's Role: " + attendant.getRole());
        System.out.println("Customer's Role: " + customer.getRole());
    }
}
