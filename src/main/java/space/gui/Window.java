package space.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

	private final JFrame frame;
	private final JPanel panel;
	
	public Window() {
		panel = new JPanel();
		frame = new JFrame();
		
		panel.setPreferredSize(new Dimension(400, 600));
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
