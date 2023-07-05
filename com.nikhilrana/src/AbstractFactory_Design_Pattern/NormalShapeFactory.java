package AbstractFactory_Design_Pattern;

public class NormalShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        shapeType = shapeType.trim().toUpperCase();
        switch (shapeType) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                System.out.println("No such shape");
        }
        return null;
    }
}
