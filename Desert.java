import java.awt.Graphics;
import java.util.Random;

public class Desert implements Landscape {
	private static final int width = 1000;
	private static final int height = 1000;
	Random rand;
	Graphics g;
	
	public void generateLandscape() {
		createObstacles();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void createObstacles() {
		for(int i = 0; i < 20; i++) {
			Pair position = new Pair(rand.nextInt(width), rand.nextInt(height));
			g.drawRect((int) position.x, (int) position.y, 10, 10);
		}
	}

}
