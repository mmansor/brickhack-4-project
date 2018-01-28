package space.entities;

import space.field.World;
import space.gui.Sprite;

public abstract class Entity implements Updateable {

	protected World world;

	public Entity(World world) {
		this.world = world;
	}
	
	public abstract double getXPosition();
	public abstract double getYPosition();
	
	
	public abstract Hitbox getHitbox();
	
	public abstract Sprite getSprite();

}
