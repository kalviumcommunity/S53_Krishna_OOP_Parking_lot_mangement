package Parking_Lot_Management.src.main;
public class Main {
    public static void main(String[] args) {
        // Create a new ParkingSpace object
        ParkingSpace space = new ParkingSpace();

        // Create a new Vehicle object
        Vehicle vehicle = new Vehicle("ABC123");

        // Check if parking space is available
        if (space.isAvailable()) {
            // Assign the vehicle to the parking space
            space.assignVehicle(vehicle);
            System.out.println("Vehicle " + vehicle.getLicensePlate() + " is assigned to the parking space.");
        }

        // Free the parking space
        space.freeSpace();
        System.out.println("Parking space is now available.");
    }
}
