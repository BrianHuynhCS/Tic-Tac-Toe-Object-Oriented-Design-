package TicTacToe;

import java.awt.Color;
import javax.swing.JButton;

public class DarkTheme extends BoardViewer {
	private static final Color LIGHT_BLUE = new Color(51, 153, 255);

	/*
	 * A constructor that creates a dark theme of the board
	 * 
	 * @param aModel the Board that this panel observes
	 */
	public DarkTheme(Board aModel) {
		super(aModel, Color.darkGray, Color.BLUE, LIGHT_BLUE);
	}

	/*
	 * Get this board's specific button.
	 * 
	 * @return this board's button.
	 */
	public JButton getInitialButton() {
		JButton darkTheme = new JButton("Dark Theme");
		darkTheme.setBackground(Color.BLACK);
		darkTheme.setForeground(LIGHT_BLUE);
		return darkTheme;
	}
}