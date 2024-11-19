package Parking_Lot_Management.src.main;

public class Customer extends ParkingUser {
    private String vehicleLicensePlate;

    // Constructor
    public Customer(String name, int id, String vehicleLicensePlate) {
        super(name, id); // Call parent constructor
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    // Implementation of abstract method
    @Override
    public String getRole() {
        return "Customer";
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + getRole() + ", Vehicle: " + vehicleLicensePlate);
    }
}