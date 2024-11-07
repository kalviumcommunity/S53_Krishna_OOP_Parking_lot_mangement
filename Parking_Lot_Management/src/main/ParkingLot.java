package Parking_Lot_Management.src.main;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpace> parkingSpaces;

    public ParkingLot(int totalSpaces) {
        parkingSpaces = new ArrayList<>();
        for (int i = 1; i <= totalSpaces; i++) {
            parkingSpaces.add(new ParkingSpace(i));  // Initialize each parking space with a unique number
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpace space : parkingSpaces) {
            if (space.isAvailable()) {
                space.assignVehicle(vehicle);
                System.out.println("Vehicle " + vehicle.getLicensePlate() + " parked in space " + space.getSpaceNumber());
                return true;
            }
        }
        System.out.println("No available parking space for vehicle " + vehicle.getLicensePlate());
        return false;
    }

    public boolean freeParkingSpace(int spaceNumber) {
        for (ParkingSpace space : parkingSpaces) {
            if (space.getSpaceNumber() == spaceNumber && !space.isAvailable()) {
                space.freeSpace();
                System.out.println("Parking space " + spaceNumber + " is now available.");
                return true;
            }
        }
        System.out.println("Parking space " + spaceNumber + " is either not in use or does not exist.");
        return false;
    }

    public void displayStatus() {
        System.out.println("Parking Lot Status:");
        for (ParkingSpace space : parkingSpaces) {
            String status = space.isAvailable() ? "Available" : "Occupied by " + space.getCurrentVehicle().getLicensePlate();
            System.out.println("Space " + space.getSpaceNumber() + ": " + status);
        }
        System.out.println("Total vehicles created: " + Vehicle.getTotalVehicles());
        System.out.println("Parking spaces in use: " + ParkingSpace.getParkingSpacesInUse());
    }
}
