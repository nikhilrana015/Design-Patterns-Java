package AbstractFactory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory_normal = FactoryProducer.getFactory("NORMAL");
        AbstractFactory abstractFactory_rounded = FactoryProducer.getFactory("ROUNDED");

        Shape normalRectangle = abstractFactory_normal.getShape("RECTANGLE");
        Shape normalSquare = abstractFactory_normal.getShape("SQUARE");

        Shape roundedRectangle = abstractFactory_rounded.getShape("RECTANGLE");
        Shape roundedSquare = abstractFactory_rounded.getShape("SQUARE");

        normalRectangle.draw();
        normalSquare.draw();

        roundedRectangle.draw();
        roundedSquare.draw();

    }
}
