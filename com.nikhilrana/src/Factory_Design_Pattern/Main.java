package Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle_1 = vehicleFactory.getVehicle("CAR");
        Vehicle vehicle_2 = vehicleFactory.getVehicle("bike");
        Vehicle vehicle_3 = vehicleFactory.getVehicle("  TrUCK   ");
        Vehicle vehicle_4 = vehicleFactory.getVehicle("BUs");

        System.out.println(vehicle_1);
        System.out.println(vehicle_2);
        System.out.println(vehicle_3);
        System.out.println(vehicle_4);

    }
}
