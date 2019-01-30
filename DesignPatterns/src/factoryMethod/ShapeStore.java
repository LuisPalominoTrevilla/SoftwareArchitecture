package factoryMethod;

public abstract class ShapeStore {

    public static Shape orderShape(String shapeType) {
        ShapeStore inst = null;
        if (shapeType.equalsIgnoreCase("Rectangle")) {
             inst = new RectangleStore();
        } else if (shapeType.equals("Square")) {
            inst = new SquareStore();
        }
        return inst.createShape();
    }

    public abstract Shape createShape();
}
