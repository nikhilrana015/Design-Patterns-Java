package Builder_Design_Pattern;

public class WardrobeTelescope {
    private int doors;
    private boolean isMirror;
    private String material;
    private int compartments;
    private boolean isWheels;
    private boolean isHangingRod;

    public WardrobeTelescope() {

    }

    public WardrobeTelescope(int doors) {
        this.doors = doors;
    }

    public WardrobeTelescope(int doors, boolean isMirror) {
        this(doors);
        this.isMirror = isMirror;
    }

    public WardrobeTelescope(int doors, boolean isMirror, String material) {
        this(doors, isMirror);
        this.material = material;
    }

    public WardrobeTelescope(int doors, boolean isMirror, String material, int compartments) {
        this(doors, isMirror, material);
        this.compartments = compartments;
    }

    public WardrobeTelescope(int doors, boolean isMirror, String material, int compartments, boolean isWheels) {
        this(doors, isMirror, material, compartments);
        this.isWheels = isWheels;
    }

    public WardrobeTelescope(int doors, boolean isMirror, String material, int compartments, boolean isWheels, boolean isHangingRod) {
        this(doors, isMirror, material, compartments, isWheels);
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
