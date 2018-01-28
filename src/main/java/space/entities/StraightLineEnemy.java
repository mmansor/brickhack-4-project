package space.entities;

import space.field.World;
import space.gui.Sprite;

import java.awt.*;
import java.awt.image.BufferedImage;

public class StraightLineEnemy extends Enemy{

    private double width;
    private double height;

    public StraightLineEnemy(World world) {
        super(world);
        setPosition(world.getWidth(), world.getHeight()/2);
        width = 50;
        height = 25;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    private Sprite sprite = new Sprite() {
        BufferedImage image = new BufferedImage(50, 25, BufferedImage.TYPE_INT_ARGB);
        public BufferedImage getImage() {
            return image;
        }
    };

    public Sprite getSprite() {
        Graphics graphics = sprite.getImage().getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,50,25);

        return sprite;
    }

    public void update() {
        move(-1,0);

        if (getXPosition() < 0){
            world.removeEnemies(this);
        }
    }
}
