import java.awt.*;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// DONE: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		// We are setting the size of the JFrame, not a JPanel
		// So we use setSize() - not setPreferredSize()
		setSize(new Dimension(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT));

		// DONE: Set the title
		setTitle(Settings.WINDOW_NAME);

		// DONE: Set the background colour to white
		setBackground(Color.WHITE);

		// DONE: Set resizable to false
		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);

		// DONE: Set visible to true
		setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
