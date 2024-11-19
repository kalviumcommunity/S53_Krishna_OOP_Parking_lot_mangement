package Parking_Lot_Management.src.main;

public class ParkingSpace {
    private boolean isAvailable;
    private Vehicle currentVehicle;
    private int spaceNumber;
    private static int parkingSpacesInUse = 0;

    // Default constructor
    public ParkingSpace() {
        this.isAvailable = true;
        this.spaceNumber = -1;  // Represents an unassigned space number
    }

    // Parameterized constructor
    public ParkingSpace(int spaceNumber) {
        this.isAvailable = true;
        this.spaceNumber = spaceNumber;
    }

    public boolean isAvailable() {
        return this.isAvailable;
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
