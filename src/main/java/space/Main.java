package space;


import space.entities.CircleEnemy;
import space.entities.Player;

import space.entities.StraightLineEnemy;
import space.field.RectangleWorld;
import space.field.World;
import space.gui.KeyStatusListener;
import space.gui.Window;

public class Main {
	public static void main(String[] args) {
		
		KeyStatusListener ksl = new KeyStatusListener();
		
		Window gameFrame = new Window(ksl);
		World world = new RectangleWorld();
		world.addEnemy(new StraightLineEnemy(world, world.getWidth(), world.getHeight()/2));
		world.addEnemy(new StraightLineEnemy(world, world.getWidth(), world.getHeight()/4));
		world.addEnemy(new StraightLineEnemy(world, world.getWidth(), world.getHeight()*3/4));
        world.addEnemy((new CircleEnemy(world)));
		Player p = new Player(world, ksl);
		world.setPlayer(p);

		
		ControlLoop loop = new ControlLoop(world, gameFrame);
		loop.run();
	}
	
}
