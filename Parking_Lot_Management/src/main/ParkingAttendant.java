package Parking_Lot_Management.src.main;

// ParkingAttendant inherits from ParkingUser
public class ParkingAttendant extends ParkingUser {
    private String shift;

    // Constructor
    public ParkingAttendant(String name, int id, String shift) {
        super(name, id); // Call parent constructor
        this.shift = shift;
    }

    // Implementation of abstract method
    @Override
    public String getRole() {
        return "Parking Attendant";
    }

    // Additional method
    public String getShift() {
        return shift;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + getRole() + ", Shift: " + shift);
    }
}