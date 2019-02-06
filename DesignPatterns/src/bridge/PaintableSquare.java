package bridge;

import java.awt.*;

public class PaintableSquare implements Paintable {

    private Figure parent;

    public PaintableSquare(Figure x) {
        this.parent = x;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(this.parent.getX(),this.parent.getY(),this.parent.getWidth(), this.parent.getHeight());
    }
}
