package space.entities;

import space.field.World;

public abstract class Entity implements Updateable {

	protected World world;
	
	public Entity(World world) {
		this.world = world;
	}
}
