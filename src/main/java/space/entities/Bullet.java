package space.entities;

import space.field.World;

public abstract class Bullet extends Entity {

	private boolean isColliding;
	private boolean isDanger;

	public Bullet(World world) {
		super(world);
	}

	public boolean getIsDanger(){
		return isDanger;
	}

}
