package AbstractFactory_Design_Pattern;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        shapeType = shapeType.trim().toUpperCase();
        switch (shapeType) {
            case "RECTANGLE":
                return new RoundedRectangle();
            case "SQUARE":
                return new RoundedSquare();
            default:
                System.out.println("No such shape");
        }
        return null;
    }
}
