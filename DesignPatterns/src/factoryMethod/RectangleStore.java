package factoryMethod;

public class RectangleStore extends ShapeStore {
    public Shape createShape() {
        return new Rectangle();
    }
}
