package AbstractFactory_Design_Pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String shapeType) {
        shapeType = shapeType.trim().toUpperCase();
        switch (shapeType) {
            case "NORMAL":
                return new NormalShapeFactory();
            case "ROUNDED":
                return new RoundedShapeFactory();
            default:
                System.out.println("No such shape-factory exists");
        }
        return null;
    }
}
