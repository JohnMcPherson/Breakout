import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		// DONE
		this.x = x;
	}
	public void setY(int y) { 
		// DONE
		this.y = y;
	}
	public void setWidth(int width) { 
		// DONE
		this.width = width;
	}
	public void setHeight(int height) { 
		// DONE
		this.height = height;
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return x;	// DONE: Return correct value
	}
	public int getY() { 
		return y;	// DONE: Return correct value
	}
	public int getWidth() { 
		return width;	// DONE: Return correct value
	}
	public int getHeight() { 
		return height;	// DONE: Return correct value
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
