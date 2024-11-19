package Parking_Lot_Management.src.main;

public class ParkingSpace {
    private boolean isAvailable;
    private boolean isReserved; // New attribute
    private Vehicle currentVehicle;
    private int spaceNumber;
    private static int parkingSpacesInUse = 0;

    // Constructor: Space number only
    public ParkingSpace(int spaceNumber) {
        this.isAvailable = true;
        this.spaceNumber = spaceNumber;
        this.isReserved = false; // Default to non-reserved
    }

    // Constructor: Space number and reserved status
    public ParkingSpace(int spaceNumber, boolean isReserved) {
        this.isAvailable = true;
        this.spaceNumber = spaceNumber;
        this.isReserved = isReserved;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public boolean isReserved() {
        return this.isReserved;
    }

    public void assignVehicle(Vehicle vehicle) {
        if (isAvailable) {
            this.currentVehicle = vehicle;
            this.isAvailable = false;
            parkingSpacesInUse++;
        }
    }

    public void freeSpace() {
        if (!isAvailable) {
            this.currentVehicle = null;
            this.isAvailable = true;
            parkingSpacesInUse--;
        }
    }

    public Vehicle getCurrentVehicle() {
        return this.currentVehicle;
    }

    public int getSpaceNumber() {
        return this.spaceNumber;
    }

    public static int getParkingSpacesInUse() {
        return parkingSpacesInUse;
    }
}
