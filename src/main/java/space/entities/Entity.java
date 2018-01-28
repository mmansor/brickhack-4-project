package space.entities;

import space.field.World;
import space.gui.Sprite;

public abstract class Entity implements Updateable {

	protected World world;
	
	private double xPos;
	private double yPos;
	
	private Hitbox hitbox = null;
	
	public Entity(World world) {
		this.world = world;
	}
	
	public  double getXPosition() {
		return xPos;
	}
	public  double getYPosition() {
		return yPos;
	}
	
	public void setPosition(double x, double y) {
		xPos = x;
		yPos = y;
	}
	
	public void move(double x, double y) {
		xPos += x;
		yPos += y;
	}
	
	
	public abstract Hitbox getHitbox();
	
	public abstract Sprite getSprite();
}
