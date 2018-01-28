package space.entities;

import space.gui.Sprite;

import java.awt.*;
import java.awt.image.BufferedImage;

public class EnemyAI extends Enemy {
    Enemy enemy ;
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

    @Override
    public void update() {
        double angle = +- 1;
        double xCoord = enemy.setPosition(enemy.getXPosition() + cos());
        double yCoord = enemy.setPosition(enemy.getYPosition() + );
        move(90,90);

    }
}
