package Parking_Lot_Management.src.main;
public class Vehicle {
    private String licensePlate;

    // Constructor
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // Member function 1: Get the vehicle's license plate
    public String getLicensePlate() {
        return licensePlate;
    }

    // Member function 2: Set the vehicle's license plate
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
