package Parking_Lot_Management.src.main;

public class Vehicle {
    private String licensePlate;

    // Static variable to track the total number of vehicles created
    private static int totalVehicles = 0;

    // Constructor
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        totalVehicles++; // Increment static counter when a new vehicle is created
    }

    // Member function 1: Get the vehicle's license plate
    public String getLicensePlate() {
        return this.licensePlate;
    }

    // Member function 2: Set the vehicle's license plate
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // Static member function to get the total number of vehicles created
    public static int getTotalVehicles() {
        return totalVehicles;
    }
}
