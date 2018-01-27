package space.enemies;

import space.field.World;

public abstract class Enemy {
	
	protected World world;
	
	public Enemy(World world) {
		this.world = world;
	}
	
	public abstract void aiTick();
	
}
