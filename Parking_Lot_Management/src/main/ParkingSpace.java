package Parking_Lot_Management.src.main;
public class ParkingSpace {
    private boolean isAvailable;
    private Vehicle currentVehicle;

    // Constructor
    public ParkingSpace() {
        this.isAvailable = true;
    }

    // Member function 1: Check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Member function 2: Assign a vehicle to the parking space
    public void assignVehicle(Vehicle vehicle) {
        this.currentVehicle = vehicle;
        this.isAvailable = false;
    }

    // Member function 3: Free the parking space
    public void freeSpace() {
        this.currentVehicle = null;
        this.isAvailable = true;
    }

    // Member function 4: Get current vehicle
    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }
}
