package space.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import space.entities.KeyStatus;

public class KeyStatusListener implements KeyStatus, KeyListener {

	private boolean wPressed = false;
	private boolean aPressed = false;
	private boolean sPressed = false;
	private boolean dPressed = false;
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			wPressed = true;
			System.out.println("W pressed");
			break;
		case KeyEvent.VK_A:
			aPressed = true;
			System.out.println("A pressed");
			break;
		case KeyEvent.VK_S:
			sPressed = true;
			System.out.println("S pressed");
			break;
		case KeyEvent.VK_D:
			dPressed = true;
			System.out.println("D pressed");
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			wPressed = false;
			break;
		case KeyEvent.VK_A:
			aPressed = false;
			break;
		case KeyEvent.VK_S:
			sPressed = false;
			break;
		case KeyEvent.VK_D:
			dPressed = false;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isWKeyDown() {
		// TODO Auto-generated method stub
		return wPressed;
	}

	@Override
	public boolean isAKeyDown() {
		// TODO Auto-generated method stub
		return aPressed;
	}

	@Override
	public boolean isSKeyDown() {
		// TODO Auto-generated method stub
		return sPressed;
	}

	@Override
	public boolean isDKeyDown() {
		// TODO Auto-generated method stub
		return dPressed;
	}

}
