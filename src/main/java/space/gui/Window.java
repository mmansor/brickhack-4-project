package space.gui;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Closeable;
import java.io.IOException;

import javax.swing.JFrame;

import space.field.World;



public class Window implements CanDrawWorld {
    private World world = null;
    private final JFrame frame;
	private final GUIPanel panel;

	public Window() {
		panel = new GUIPanel();
		frame = new JFrame();
		
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GUIPanel GUI = new GUIPanel();

		GUI.drawWorld(world);


		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
	}

    @Override
    public void drawWorld(World world) {

		panel.setPreferredSize(new Dimension(world.getWidth(), world.getHeight()));
        panel.drawWorld(world);
        
        frame.pack();
    }
}

