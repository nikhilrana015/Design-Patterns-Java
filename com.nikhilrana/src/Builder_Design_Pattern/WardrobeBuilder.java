package Builder_Design_Pattern;

public class WardrobeBuilder {
    private int doors;
    private boolean isMirror;
    private String material;
    private int compartments;
    private boolean isWheels;
    private boolean isHangingRod;

    public static class Builder {
        private int doors;
        private boolean isMirror;
        private String material;
        private int compartments;
        private boolean isWheels;
        private boolean isHangingRod;

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }
        public Builder mirrors(boolean isMirror) {
            this.isMirror = isMirror;
            return this;
        }
        public Builder material(String material) {
            this.material = material;
            return this;
        }
        public Builder compartments(int compartments) {
            this.compartments = compartments;
            return this;
        }
        public Builder wheels(boolean isWheels) {
            this.isWheels = isWheels;
            return this;
        }
        public Builder hangingRod(boolean isHangingRod) {
            this.isHangingRod = isHangingRod;
            return this;
        }
        public WardrobeBuilder build() {
            return new WardrobeBuilder(this);
        }
    }

    private WardrobeBuilder(Builder builder){
        this.compartments = builder.compartments;
        this.doors = builder.doors;
        this.isHangingRod = builder.isHangingRod;
        this.isMirror = builder.isMirror;
        this.isWheels = builder.isWheels;
        this.material = builder.material;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isMirror() {
        return isMirror;
    }

    public String getMaterial() {
        return material;
    }

    public int getCompartments() {
        return compartments;
    }

    public boolean isWheels() {
        return isWheels;
    }

    public boolean isHangingRod() {
        return isHangingRod;
    }
}
