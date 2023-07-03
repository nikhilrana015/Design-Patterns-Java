package Builder_Design_Pattern;

public class Main {
    public static void main(String[] args) {

        // Normal initialization of wardrobe object
        // If in class there are n variables then 2^n possible combinations to create
        // different constructors because different clients required different variables.
        Wardrobe wardrobe = new Wardrobe();
        wardrobe.setCompartments(4);
        wardrobe.setDoors(2);
        wardrobe.setHangingRod(true);
        wardrobe.setMaterial("Wooden");
        wardrobe.setMirror(true);
        wardrobe.setWheels(false);

        System.out.println("** Normal initialization **");
        System.out.println("Total Compartments: " + wardrobe.getCompartments());
        System.out.println("Total Doors: " + wardrobe.getDoors());
        System.out.println("Is hanging rod: " + wardrobe.isHangingRod());
        System.out.println("Material type: " + wardrobe.getMaterial());
        System.out.println("Is mirror: " + wardrobe.isMirror());
        System.out.println("Is wheels: " + wardrobe.isWheels());

        // Creating wardrobe using builder design pattern. In this client set up the fields
        // of their own use-case and it doesn't create backward-compatibility issues
        // Here we didn't set up material and mirror variables.
        WardrobeBuilder.Builder builder = new WardrobeBuilder.Builder()
                                            .compartments(7)
                                            .doors(2)
                                            .hangingRod(true)
                                            .wheels(false);

        WardrobeBuilder wardrobeBuilder = builder.build();

        System.out.println("\n** Using Builder design pattern **");
        System.out.println("Total Compartments: " + wardrobeBuilder.getCompartments());
        System.out.println("Total Doors: " + wardrobeBuilder.getDoors());
        System.out.println("Is hanging rod: " + wardrobeBuilder.isHangingRod());
        System.out.println("Material type: " + wardrobeBuilder.getMaterial());
        System.out.println("Is mirror: " + wardrobeBuilder.isMirror());
        System.out.println("Is wheels: " + wardrobeBuilder.isWheels());







    }
}
