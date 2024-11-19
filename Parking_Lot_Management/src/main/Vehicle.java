package Parking_Lot_Management.src.main;

public class Vehicle {
    private String licensePlate;
    private static int totalVehicles = 0;

    // Default constructor
    public Vehicle() {
        this.licensePlate = "UNKNOWN";
        totalVehicles++;
    }

    // Parameterized constructor
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        totalVehicles++;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }
}
