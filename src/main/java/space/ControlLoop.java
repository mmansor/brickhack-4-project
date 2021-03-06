package space;

import space.field.World;
import space.gui.CanDrawWorld;

public class ControlLoop implements Runnable {
	
	private final World world;
	private final CanDrawWorld renderer;
	
	
	private final int UPDATES_PER_SECOND = 60;
	private final int UPDATE_PERIOD = 1000 / UPDATES_PER_SECOND;
	
	private boolean isClosing = false;
	
	public ControlLoop(World world, CanDrawWorld renderer) {
		this.world = world;
		this.renderer = renderer;
	}
	
	public void run() {
		
		long lastUpdateTime = System.currentTimeMillis();
		while(!isClosing) {
			world.update();
			renderer.drawWorld(world);
			
			long sleepTime = System.currentTimeMillis() + UPDATE_PERIOD - lastUpdateTime;
			if(sleepTime > 0) {
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			
			lastUpdateTime = System.currentTimeMillis();
		}
	}
	
	public void close() {
		isClosing = true;
	}
	
	
}
