package bridge;

import java.awt.*;

public class PaintableCircle implements Paintable {

    private Figure parent;

    public PaintableCircle(Figure x) {
        this.parent = x;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(this.parent.getX(),this.parent.getY(),this.parent.getWidth(), this.parent.getHeight());
    }
}
