package adapter.src;

import java.awt.*;

public class CircleWrapper extends Figure implements Adaptable {

    private Circle adaptee;

    public CircleWrapper(Circle adaptee) {
        this.adaptee = adaptee;
    }

    public void paint(Graphics g) {
        this.adaptee.draw(g);
    }

    public void setX(int x) {
        this.adaptee.setX(x);
    }

    public void setY(int y) {
        this.adaptee.setY(y);
    }

    public int getX() {
        return this.adaptee.getX();
    }

    public int getY() {
        return this.adaptee.getY();
    }
}
