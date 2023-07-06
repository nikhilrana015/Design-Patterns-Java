package Strategy_Design_Pattern;

// Context class
public class Vehicle {
    private DrivingStrategy drivingStrategy;
    public Vehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
    void driveVehicle() {
        this.drivingStrategy.drive();
    }
}
