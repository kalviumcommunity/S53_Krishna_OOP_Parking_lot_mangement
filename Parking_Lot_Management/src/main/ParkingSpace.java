package Parking_Lot_Management.src.main;

public class ParkingSpace {
    private boolean isAvailable;
    private Vehicle currentVehicle;

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
        this.currentVehicle = vehicle;
        this.isAvailable = false;
        parkingSpacesInUse++; // Increment static counter
    }

    // Member function 3: Free the parking space
    public void freeSpace() {
        this.currentVehicle = null;  // Setting it to null to indicate no vehicle is assigned
        this.isAvailable = true;
        parkingSpacesInUse--; // Decrement static counter
    }

    // Member function 4: Get current vehicle
    public Vehicle getCurrentVehicle() {
        return this.currentVehicle;
    }

    // Static function to get the number of parking spaces in use
    public static int getParkingSpacesInUse() {
        return parkingSpacesInUse;
    }
}
