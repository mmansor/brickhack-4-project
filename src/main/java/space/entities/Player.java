package space.entities;

import space.field.World;
import space.gui.Sprite;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Collection;

public class Player extends Entity{

	private double xPosition;
	private double yPosition;
	private double width;
	private double height;
	private Hitbox hitbox;
	private KeyStatus typing;
	private Collection<Bullet> bullets;
	private Collection<Enemy> enemies;

	private long lastFire = 0;

	public Player(World world, KeyStatus keys) {
		super(world);
		xPosition = 100;
		yPosition = world.getHeight()/2;
		width = 50;
		height = 25;
		hitbox = new RectangleHitbox(xPosition, yPosition, width, height);
		typing = keys;
	}

	public double getXPosition() {
		return xPosition;
	}

	public double getYPosition() {
		return yPosition;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Hitbox getHitbox() {
		return hitbox;
	}

	private Sprite sprite = new Sprite() {
		BufferedImage image = new BufferedImage(50, 25, BufferedImage.TYPE_INT_ARGB);
		public BufferedImage getImage() {
			return image;
		}
	};

	public Sprite getSprite() {
		Graphics graphics = sprite.getImage().getGraphics();
		graphics.setColor(Color.BLUE);
		graphics.fillRect(0,0,50,25);

		return sprite;
	}

	public void update() {
		if(typing.shouldMoveLeft() == true) {
			xPosition -= 10;
		}
		if(typing.shouldMoveRight() == true) {
			xPosition += 10;
		}
		if(typing.shouldMoveDown() == true) {
			yPosition += 10;
		}
		if(typing.shouldMoveUp() == true) {
			yPosition -= 10;
		}
		if(typing.shouldShoot() == true && System.currentTimeMillis() - lastFire > 500) {
			System.out.println("Shoot");
			world.addBullets(new StandardPlayerBullet(world, xPosition + width + 1, yPosition + height/4));
			lastFire = System.currentTimeMillis();
		}
	}
}
