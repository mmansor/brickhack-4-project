package space;

import space.entities.CircleEnemy;
import space.entities.StraightLineEnemy;
import space.field.RectangleWorld;
import space.field.World;
import space.gui.Window;

public class Main {
	public static void main(String[] args) {
		Window gameFrame = new Window();
		World world = new RectangleWorld();
		world.addEnemy(new StraightLineEnemy(world));
		world.addEnemy(new CircleEnemy(world));
		
		ControlLoop loop = new ControlLoop(world, gameFrame);
		loop.run();
	}
	
}
