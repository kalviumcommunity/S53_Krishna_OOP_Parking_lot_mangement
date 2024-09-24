package Parking_Lot_Management.src.main;
public class Main {
    public static void main(String[] args) {
        // Create an array of ParkingSpace objects with 5 spaces
        ParkingSpace[] parkingSpaces = new ParkingSpace[5];
        
        // Initialize each parking space in the array
        for (int i = 0; i < parkingSpaces.length; i++) {
            parkingSpaces[i] = new ParkingSpace();
        }

        // Create a new Vehicle object
        Vehicle vehicle1 = new Vehicle("ABC123");
        Vehicle vehicle2 = new Vehicle("XYZ789");

        // Assign vehicle1 to the first available parking space
        for (ParkingSpace space : parkingSpaces) {
            if (space.isAvailable()) {
                space.assignVehicle(vehicle1);
                System.out.println("Vehicle " + vehicle1.getLicensePlate() + " is assigned to a parking space.");
                break;
            }
        }

        // Assign vehicle2 to the next available parking space
        for (ParkingSpace space : parkingSpaces) {
            if (space.isAvailable()) {
                space.assignVehicle(vehicle2);
                System.out.println("Vehicle " + vehicle2.getLicensePlate() + " is assigned to a parking space.");
                break;
            }
        }

        // Free all parking spaces after the vehicles leave
        for (ParkingSpace space : parkingSpaces) {
            space.freeSpace();
        }
        System.out.println("All parking spaces are now available.");
    }
}
