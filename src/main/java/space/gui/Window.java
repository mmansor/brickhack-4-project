package space.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import space.field.World;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Window implements CanDrawWorld {
    private World world = null;
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

	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	  //  g.drawImage(world.getPlayer().getSprite().getImage(), world.getPlayer().getXPosition(), world.getPlayer().getYPosition(), null);

	    for(Enemy enemy: world.getEnemies()){
	       g.drawImage(enemy.getSprite().getImage(), enemy.getXPosition(), enemy.getYPosition(), null);

        }

    }

    @Override
    public void drawWorld(World world) {
    this.world = world;
    repaint();
    }
}

