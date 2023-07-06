package Strategy_Design_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String vehicleType;
        Scanner sc = new Scanner(System.in);
        vehicleType = sc.nextLine();

        vehicleType = vehicleType.trim();

        Vehicle vehicle;

        if(vehicleType.equalsIgnoreCase("NORMAL"))
            vehicle = new GoodsVehicle();
        else
            vehicle = new SportsVehicle();

        vehicle.driveVehicle();
    }
}
