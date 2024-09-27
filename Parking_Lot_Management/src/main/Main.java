package Parking_Lot_Management.src.main;

public class Main {
    public static void main(String[] args) {
        // Dynamic memory allocation using 'new'
        ParkingSpace space = new ParkingSpace();
        Vehicle vehicle = new Vehicle("ABC123");

        // Assign vehicle2 to the next available parking space
        for (ParkingSpace space : parkingSpaces) {
            if (space.isAvailable()) {
                space.assignVehicle(vehicle2);
                System.out.println("Vehicle " + vehicle2.getLicensePlate() + " is assigned to a parking space.");
                break;
            }
        }

        // Display the static counts
        System.out.println("Total vehicles created: " + Vehicle.getTotalVehicles());
        System.out.println("Parking spaces in use: " + ParkingSpace.getParkingSpacesInUse());

        // Free the parking space
        space.freeSpace();
        System.out.println("Parking space is now available.");

        // In Java, no need for manual deletion as Garbage Collector handles it
        space = null;  // This allows the Garbage Collector to free the memory eventually
        vehicle = null;  // Same here for the Vehicle object

        // Display the updated parking space count
        System.out.println("Parking spaces in use after freeing: " + ParkingSpace.getParkingSpacesInUse());
    }
}
