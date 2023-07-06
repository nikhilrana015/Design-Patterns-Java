package Strategy_Design_Pattern;

public class SportsDrivingStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Applying sports driving strategy");
    }
}
