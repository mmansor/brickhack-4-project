package space.gui;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;


import space.entities.Enemy;
import space.entities.Bullet;
import space.field.World;


public class GUIPanel extends JPanel {
    private World world = null;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());


        // bullet collections

    if(world != null) {
        //g.drawImage(world.getPlayer().getSprite().getImage(), (int)world.getPlayer().getXPosition(),(int) world.getPlayer().getYPosition(), null);

        for (Enemy enemy : world.getEnemies()) {
            g.drawImage(enemy.getSprite().getImage(), (int)enemy.getXPosition(),(int) enemy.getYPosition(), null);

            }
        }

        //for(Bullet bullet : world.getBullets()){
        //    g.drawImage(bullet.getSprite().getImage(), (int)bullet.getXPosition(),(int)bullet.getYPosition(),null);
//
  //      }



    }

    public void drawWorld(World world) {
        this.world = world;
        repaint();
    }
}
