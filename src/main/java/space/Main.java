package space;

import space.gui.Window;

public class Main {
	public static void main(String[] args) {
		

		ControlLoop loop = new ControlLoop(null, null);
		loop.run();
	}
	Window gameFrame = new Window();
}
