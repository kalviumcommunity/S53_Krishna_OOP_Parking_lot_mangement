package Parking_Lot_Management.src.main;

public class Employee extends Person {
    private String employeeId;

    // Constructor
    public Employee(String name, int age, String employeeId) {
        super(name, age); // Call parent constructor
        this.employeeId = employeeId;
    }

    // Default constructor
    public Employee() {
        super(); // Call default constructor of Person
        this.employeeId = "EMP000";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Employee ID: " + employeeId);
    }
}
