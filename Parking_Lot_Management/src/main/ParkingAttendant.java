package Parking_Lot_Management.src.main;

public class ParkingAttendant extends Employee {
    private String shift;

    // Constructor
    public ParkingAttendant(String name, int age, String employeeId, String shift) {
        super(name, age, employeeId); // Call Employee constructor
        this.shift = shift;
    }

    // Default constructor
    public ParkingAttendant() {
        super(); // Call Employee default constructor
        this.shift = "Day";
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Employee method
        System.out.println("Shift: " + shift);
    }
}
