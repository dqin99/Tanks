import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {
	private static final int width = 1000;
	private static final int height = 1000;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tanks");
		frame.setPreferredSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 1000);
	}

}
