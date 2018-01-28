package space.entities;

import space.field.World;
import space.gui.Sprite;

public abstract class Entity implements Updateable {

	protected World world;

	public abstract double getWidth();
	public abstract double getHeight();

	
	private final Hitbox hitbox;

	public Entity(World world) {

		this.world = world;
		hitbox = new RectangleHitbox(0,0, getWidth(),getHeight());
	}
	
	public  double getXPosition() {
		return getHitbox().getXPosition();
	}
	public  double getYPosition() {

		return getHitbox().getYPosition();
	}
	
	public void setPosition(double x, double y) {
		hitbox.setXPosition(x);
		hitbox.setYPosition(y);
	}
	
	public void move(double x, double y) {
		hitbox.setXPosition(getXPosition() + x);
		hitbox.setYPosition(getYPosition() + y);
	}
	
	
	public Hitbox getHitbox(){
		return hitbox;
	}
	
	public abstract Sprite getSprite();

}
