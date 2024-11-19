package Parking_Lot_Management.src.main;

public class Main {
    public static void main(String[] args) {
        // Create Parking Lot
        ParkingLot parkingLot = new ParkingLot(5);

        // Use constructor overloading to create parking spaces
        ParkingSpace reservedSpace = new ParkingSpace(1, true);
        ParkingSpace regularSpace = new ParkingSpace(2);

        // Display reserved status
        System.out.println("Space " + reservedSpace.getSpaceNumber() + " reserved: " + reservedSpace.isReserved());
        System.out.println("Space " + regularSpace.getSpaceNumber() + " reserved: " + regularSpace.isReserved());

        // Use overloaded park methods
        Vehicle vehicle = new Vehicle("CAR001");
        vehicle.park("CAR002", parkingLot); // Park using license plate
        vehicle.park(vehicle, parkingLot); // Park using a Vehicle object

        // Display parking lot status
        parkingLot.displayStatus();

        // Free a parking space
        parkingLot.freeParkingSpace(1);
    }
}
