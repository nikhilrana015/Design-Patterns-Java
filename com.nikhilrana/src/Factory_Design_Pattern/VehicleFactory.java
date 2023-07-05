package Factory_Design_Pattern;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {

        vehicleType = vehicleType.trim().toUpperCase();

        switch (vehicleType) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "TRUCK":
                return new Truck();
            default:
                System.out.println("No such vehicle-type is found");
        }

        return null;
    }
}
