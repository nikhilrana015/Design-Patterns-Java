package Strategy_Design_Pattern;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDrivingStrategy());
    }
}
