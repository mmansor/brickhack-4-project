package space.entities;

import space.field.World;
import space.gui.Sprite;
import space.gui.sprites.SpriteRegistry;

import java.awt.*;
import java.awt.image.BufferedImage;

public class StandardPlayerBullet extends Bullet{

    private boolean isPlayer;

    public StandardPlayerBullet(World world, double x, double y) {
        super(world);
        setPosition(x,y);
        isPlayer = true;
    }

    public double getWidth() {
        return 15;
    }

    public double getHeight() {
        return 8;
    }


    public Sprite getSprite() {
        return SpriteRegistry.getSpriteRegistry().getSprite("Bullet");
    }

    public void update() {
        move(2,0);
        if (getXPosition() > world.getWidth()){
            world.removeBullets(this);
        }

    }
}
