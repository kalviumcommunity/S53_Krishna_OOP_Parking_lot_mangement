package Parking_Lot_Management.src.main;

public class Vehicle {
    private String licensePlate;
    private static int totalVehicles = 0;

    public Vehicle(String licensePlate) {
        setLicensePlate(licensePlate);  // Using setter for validation if needed
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
