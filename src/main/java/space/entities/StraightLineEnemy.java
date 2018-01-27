package space.entities;

import space.field.World;
import space.gui.Sprite;

import java.awt.*;
import java.awt.image.BufferedImage;

public class StraightLineEnemy extends Enemy{

    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private Hitbox hitbox;

    public StraightLineEnemy(World world) {
        super(world);
        xPosition = world.getWidth();
        yPosition = world.getHeight()/2;
        width = 50;
        height = 25;
        hitbox = new RectangleHitbox(xPosition, yPosition, width, height);

    }

    public double getXPosition() {
        return xPosition;
    }

    public double getYPosition() {
        return yPosition;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Hitbox getHitbox() {
        return hitbox;
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
        xPosition -= 1;
    }
}
