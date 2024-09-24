package Parking_Lot_Management.src.main;
public class Vehicle {
    private String licensePlate;

    // Constructor
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // Member function 1: Get the vehicle's license plate
    public String getLicensePlate() {
        return this.licensePlate;  // Using 'this' to refer to the current object's license plate
    }

    // Member function 2: Set the vehicle's license plate
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;  // Using 'this' to avoid confusion with method parameter
    }
}
