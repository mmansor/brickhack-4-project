package space.entities;


import space.gui.Sprite;
import space.field.World;

import java.awt.*;
import java.awt.image.BufferedImage;

public class CircleEnemy extends Enemy {
    public CircleEnemy(World world){
        super(world);
    }

    @Override
    public Hitbox getHitbox() {
        return null;
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


    double speed = .05;
    double angle = 1;
    @Override
    public void update() {
        angle += 1;
        double xCoord = 400 + 100 * Math.sin(speed * angle);
        double yCoord =  300 + 100 * Math.cos(speed * angle);

        setPosition(xCoord,yCoord);

    }
}
