package Parking_Lot_Management.src.main;

public class Main {
    public static void main(String[] args) {
        // Create a parking lot with 3 spaces
        ParkingLot parkingLot = new ParkingLot(3);

        // Create some vehicles
        Vehicle vehicle1 = new Vehicle("ABC123");
        Vehicle vehicle2 = new Vehicle("XYZ789");
        Vehicle vehicle3 = new Vehicle("LMN456");
        Vehicle vehicle4 = new Vehicle("DEF321");

        // Park vehicles
        parkingLot.parkVehicle(vehicle1);
        parkingLot.parkVehicle(vehicle2);
        parkingLot.parkVehicle(vehicle3);
        // Attempt to park a fourth vehicle
        parkingLot.parkVehicle(vehicle4);  // Expected to fail as there are only 3 spaces

        // Display parking lot status
        parkingLot.displayStatus();

        // Free up a parking space
        parkingLot.freeParkingSpace(2);

        // Attempt to park the fourth vehicle again
        parkingLot.parkVehicle(vehicle4);

        // Display final parking lot status
        parkingLot.displayStatus();
    }
}
