package Parking_Lot_Management.src.main;

public class ParkingSpace {
    private boolean isAvailable;
    private Vehicle currentVehicle;
    private static int parkingSpacesInUse = 0;

    public ParkingSpace() {
        this.isAvailable = true;
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
        this.currentVehicle = null;
        this.isAvailable = true;
        parkingSpacesInUse--;
    }

    public Vehicle getCurrentVehicle() {
        return this.currentVehicle;
    }

    public static int getParkingSpacesInUse() {
        return parkingSpacesInUse;
    }
}
