package factoryMethod;

public class SquareStore extends ShapeStore {
    public Shape createShape() {
        return new Square();
    }
}
