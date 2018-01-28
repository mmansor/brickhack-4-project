package space.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Component;

import space.field.World;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Window implements CanDrawWorld {
    private World world = null;
    private final JFrame frame;
	private final GUIPanel panel;

	public Window() {
		panel = new GUIPanel();
		frame = new JFrame();
		
		panel.setPreferredSize(new Dimension(400, 600));
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		GUIPanel GUI = new GUIPanel();

		GUI.drawWorld(world);

		



	}

    @Override
    public void drawWorld(World world) {
        panel.drawWorld(world);
    }
}

