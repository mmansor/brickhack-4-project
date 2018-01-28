package space.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import space.entities.KeyStatus;

public class KeyStatusListener implements KeyStatus, KeyListener {

	private boolean wPressed = false;
	private boolean aPressed = false;
	private boolean sPressed = false;
	private boolean dPressed = false;
	private boolean spacePressed = false;
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			wPressed = true;
			break;
		case KeyEvent.VK_A:
			aPressed = true;
			break;
		case KeyEvent.VK_S:
			sPressed = true;
			break;
		case KeyEvent.VK_D:
			dPressed = true;
			break;
		case KeyEvent.VK_SPACE:
			spacePressed = true;
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
		case KeyEvent.VK_SPACE:
			spacePressed = false;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean shouldMoveUp() {
		// TODO Auto-generated method stub
		return wPressed;
	}

	@Override
	public boolean shouldMoveLeft() {
		// TODO Auto-generated method stub
		return aPressed;
	}

	@Override
	public boolean shouldMoveDown() {
		// TODO Auto-generated method stub
		return sPressed;
	}

	@Override
	public boolean shouldMoveRight() {
		// TODO Auto-generated method stub
		return dPressed;
	}

	@Override
	public boolean shouldShoot() {
		// TODO Auto-generated method stub
		return spacePressed;
	}

}
