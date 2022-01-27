import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor
	public Ball() {
		// DONE: Set width to Settings.BALL_WIDTH
		setWidth(Settings.BALL_WIDTH);

		// DONE: Set height (initially width) to Settings.BALL_HEIGHT
		setHeight(Settings.BALL_HEIGHT);

		// DONE: Call resetPosition
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);

		// DONE: Set the balls y by using the INITIAL_BALL_Y (see above)
		setY(Settings.INITIAL_BALL_Y);
	}
	
	public void update() {
		x += xVelocity;

		// DONE: Increase the y variable by yVelocity (see above)
		y += yVelocity;
		
		// Bounce off left side of screen
		if(x <= 0) {
			// DONE: Set x to 0 so it does not leave the screen
			x = 0;

			// DONE: Change the x velocity to make the ball go right
			// TOCHECK whether should use the setter
			// reverse the xVelocity
			xVelocity = -xVelocity;
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			// DONE: Set x to the right edge of the screen (see the above if condition)
			x = Settings.WINDOW_WIDTH - Settings.BALL_WIDTH;

			// DONE: Change the x velocity to make the ball go left
			// TOCHECK whether should use the setter
			// reverse the xVelocity
			xVelocity = -xVelocity;
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			// DONE: Set y to 0 so it does not leave the screen
			y = 0;

			// DONE: Change the y velocity to make the ball go downward
			// TOCHECK whether should use the setter
			// reverse the y velocity
			yVelocity = -yVelocity;
		}
		
	}
	
	public void setXVelocity(int xVelocity) { //change parameter name to align with purpose of function
		// DONE: Set the x velocity
		this.xVelocity = xVelocity;
	}
	public void setYVelocity(int yVelocity) { //change parameter name to align with purpose of function
		// DONE: Set the y velocity
		this.yVelocity = yVelocity;
	}
	
	public int getXVelocity() {
		return xVelocity;	// DONE: Return the x velocity
	}
	public int getYVelocity() {
		return yVelocity;	// DONE: Return the y velocity
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
