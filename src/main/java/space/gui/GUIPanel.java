package space.gui;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;


import space.entities.Enemy;
import space.field.World;


public class GUIPanel extends JPanel {
    private World world = null;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        //  g.drawImage(world.getPlayer().getSprite().getImage(), world.getPlayer().getXPosition(), world.getPlayer().getYPosition(), null);
    if(world != null) {
    	
        for (Enemy enemy : world.getEnemies()) {
            g.drawImage(enemy.getSprite().getImage(), (int)enemy.getXPosition(),(int) enemy.getYPosition(), null);

            }
        }

    }

    public void drawWorld(World world) {
        this.world = world;
        repaint();
    }
}
