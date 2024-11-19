package Parking_Lot_Management.src.main;

public class Main {
    public static void main(String[] args) {
        // Create Parking Lot
        ParkingLot parkingLot = new ParkingLot(5);

        // Add vehicles
        Vehicle vehicle1 = new Vehicle("CAR001");
        Vehicle vehicle2 = new Vehicle("BIKE002");

        parkingLot.parkVehicle(vehicle1);
        parkingLot.parkVehicle(vehicle2);

        // Create Parking Attendant (multilevel inheritance)
        ParkingAttendant attendant = new ParkingAttendant("John Doe", 28, "EMP123", "Night");
        System.out.println("\nParking Attendant Details:");
        attendant.displayInfo();

        // Display parking lot status
        System.out.println("\nParking Lot Status:");
        parkingLot.displayStatus();

        // Free parking space and display updated status
        parkingLot.freeParkingSpace(1);
        System.out.println("\nUpdated Parking Lot Status:");
        parkingLot.displayStatus();
    }
}
