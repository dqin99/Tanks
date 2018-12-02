import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Tank {
	public double health = 100;
	public Pair position;
	public Pair velocity = new Pair(50, 50);
	public Pair acceleration = new Pair(20, 20);
	private static int tankID = 0;
	Random rand;

	public Tank() {
		tankID++;
	}
	
	public void move() {
		
	}
	public void shoot() {
		
	}
	public double getHealth() {
		return health;
	}
	public Pair getPosition() {
		return position;
	}
	public void draw(Graphics g) {
		Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
		
		g.setColor(color.GREEN);
		g.drawRect((int) position.x, (int) position.y, 10, 10);
	}
}
