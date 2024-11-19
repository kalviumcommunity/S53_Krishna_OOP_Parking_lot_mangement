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

    // Overloaded park method: Accept license plate as input
    public void park(String licensePlate, ParkingLot parkingLot) {
        Vehicle vehicle = new Vehicle(licensePlate); // Create new Vehicle object
        parkingLot.parkVehicle(vehicle);
    }

    // Overloaded park method: Accept a Vehicle object as input
    public void park(Vehicle vehicle, ParkingLot parkingLot) {
        parkingLot.parkVehicle(vehicle); // Directly park the provided vehicle
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
