package Builder_Design_Pattern;

public class Wardrobe {
    private int doors;
    private boolean isMirror;
    private String material;
    private int compartments;
    private boolean isWheels;
    private boolean isHangingRod;

    public Wardrobe() {

    }

    public Wardrobe(int doors) {
        this.doors = doors;
    }

    public Wardrobe(int doors, boolean isMirror) {
        this.doors = doors;
        this.isMirror = isMirror;
    }

    public Wardrobe(int doors, boolean isMirror, String material) {
        this.doors = doors;
        this.isMirror = isMirror;
        this.material = material;
    }

    public Wardrobe(int doors, boolean isMirror, String material, int compartments) {
        this.doors = doors;
        this.isMirror = isMirror;
        this.material = material;
        this.compartments = compartments;
    }

    public Wardrobe(int doors, boolean isMirror, String material, int compartments, boolean isWheels) {
        this.doors = doors;
        this.isMirror = isMirror;
        this.material = material;
        this.compartments = compartments;
        this.isWheels = isWheels;
    }

    public Wardrobe(int doors, boolean isMirror, String material, int compartments, boolean isWheels, boolean isHangingRod) {
        this.doors = doors;
        this.isMirror = isMirror;
        this.material = material;
        this.compartments = compartments;
        this.isWheels = isWheels;
        this.isHangingRod = isHangingRod;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isMirror() {
        return isMirror;
    }

    public void setMirror(boolean mirror) {
        isMirror = mirror;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCompartments() {
        return compartments;
    }

    public void setCompartments(int compartments) {
        this.compartments = compartments;
    }

    public boolean isWheels() {
        return isWheels;
    }

    public void setWheels(boolean wheels) {
        isWheels = wheels;
    }

    public boolean isHangingRod() {
        return isHangingRod;
    }

    public void setHangingRod(boolean hangingRod) {
        isHangingRod = hangingRod;
    }
}
