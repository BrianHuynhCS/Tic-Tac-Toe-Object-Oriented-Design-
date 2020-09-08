package TicTacToe;

import java.awt.Color;
import javax.swing.JButton;

public class RainbowTheme extends BoardViewer {
	private static final Color LIGHT_GREEN = new Color(0, 255, 51);

	/*
	 * A constructor that creates a rainbow theme of the board
	 * 
	 * @param aModel the Board that this panel observes
	 */
	public RainbowTheme(Board aModel) {
		super(aModel, LIGHT_GREEN, Color.RED, Color.YELLOW);
	}

	/*
	 * Get this board's specific button.
	 * 
	 * @return this board's button.
	 */
	public JButton getInitialButton() {
		JButton rainbowTheme = new JButton("Rainbow Theme");
		rainbowTheme.setBackground(Color.YELLOW);
		rainbowTheme.setForeground(Color.GREEN);
		return rainbowTheme;
	}
}