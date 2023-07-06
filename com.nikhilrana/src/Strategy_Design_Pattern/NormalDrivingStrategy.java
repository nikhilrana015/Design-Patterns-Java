package Strategy_Design_Pattern;

public class NormalDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Applying normal driving strategy");
    }
}
