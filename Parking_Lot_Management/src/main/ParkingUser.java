package Parking_Lot_Management.src.main;

public abstract class ParkingUser {
    private String name;
    private int id;

    // Constructor
    public ParkingUser(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method (virtual function)
    public abstract String getRole();

    // Concrete method
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
