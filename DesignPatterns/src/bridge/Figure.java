package bridge;

import java.awt.Graphics;

public abstract class Figure {

	public Paintable paintable;
	public abstract void setX(int x);
	public abstract void setY(int y);
	public abstract int getX();
	public abstract int getY();
	public abstract int getWidth();
	public abstract int getHeight();
}
