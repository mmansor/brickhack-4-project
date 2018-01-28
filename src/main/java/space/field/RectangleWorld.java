package space.field;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import space.entities.Bullet;
import space.entities.Enemy;
import space.entities.Player;

public class RectangleWorld implements World {

	private Player player = null;
	private List<Bullet> bullets = new ArrayList();
	private List<Enemy> enemies = new ArrayList();
	
	public RectangleWorld() {
	}
	
	
	@Override
	public void update() {
		if(player != null) {
			player.update();
		}
		
		for(Enemy e: enemies) {
			e.update();
		}
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return player;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 800;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 600;
	}

	@Override
	public Collection<Bullet> getBullets() {
		// TODO Auto-generated method stub
		return bullets;
	}

	@Override
	public Collection<Enemy> getEnemies() {
		// TODO Auto-generated method stub
		return enemies;
	}

	public void addBullets(Bullet b) {
		bullets.add(b);
	}

	public void addEnemies(Enemy e) {
		enemies.add(e);
	}
	

	public void setPlayer(Player player) {
		this.player = player;
	}


	@Override
	public void addEnemy(Enemy enemy) {
		enemies.add(enemy);
		
	}

}
