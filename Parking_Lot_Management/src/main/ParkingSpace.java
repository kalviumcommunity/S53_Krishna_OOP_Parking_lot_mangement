package Parking_Lot_Management.src.main;

public class ParkingSpace {
    private boolean isAvailable;
    // Static variable to track the number of parking spaces in use
    private static int parkingSpacesInUse = 0;

    // Constructor
    public ParkingSpace() {
        this.isAvailable = true;
    }

    // Member function 1: Check availability
    public boolean isAvailable() {
        return this.isAvailable;
    }

    // Member function 2: Assign a vehicle to the parking space
    public void assignVehicle(Vehicle vehicle) {
        this.isAvailable = false;
        parkingSpacesInUse++; // Increment static counter
    }

    // Member function 3: Free the parking space
    public void freeSpace() {
        this.isAvailable = true;
        parkingSpacesInUse--; // Decrement static counter
    }

    // Static member function to get the number of parking spaces in use
    public static int getParkingSpacesInUse() {
        return parkingSpacesInUse;
    }
}
