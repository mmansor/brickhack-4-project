package space.field;

import java.util.Collection;

import space.entities.Bullet;
import space.entities.Enemy;
import space.entities.Player;
import space.entities.Updateable;

public interface World extends Updateable {

	public abstract Player getPlayer();
	
	public abstract int getWidth();
	public abstract int getHeight();
	
	public abstract Collection<Bullet> getBullets();
	public abstract Collection<Enemy> getEnemies();
}
