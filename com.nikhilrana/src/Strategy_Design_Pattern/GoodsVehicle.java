package Strategy_Design_Pattern;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDrivingStrategy());
    }
}
