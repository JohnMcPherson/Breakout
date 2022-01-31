import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// DONE: Set width to Settings.PADDLE_WIDTH
		// we have a setter - so we use it
		setWidth(Settings.PADDLE_WIDTH);

		// DONE: Set width to Settings.PADDLE_HEIGHT
		// we have a setter - so we use it
		setHeight(Settings.PADDLE_HEIGHT);

		// DONE: Call resetPosition
		resetPosition();
	}
	
	public void resetPosition() {
		// DONE: Set initial position x and y (use INITIAL_PADDLE_X/Y)
		// Note: Check Ball.java for a hint

		// use our code pattern of using the setters to initialise variables
		setX(Settings.INITIAL_PADDLE_X);
		setY(Settings.INITIAL_PADDLE_Y);
	}
	
	public void update() {
		x += xVelocity;
		
		// DONE: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)

		// The paddle is under user control. We stop, but we do not bounce off the side of the screen

		// Check if we have hit the left side of the screen
		if(x <= 0) {
			// Set x to 0 so the paddle does not leave the screen
			x = 0;
		}

		// Check if we have hit the right side of the screen
		if(x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) { // Stop on the right side of screen
			// Set x to the right edge of the screen (see the above if condition)
			x = Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH;
		}
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		// DONE: Set x velocity
		xVelocity = vel;
	}
}
