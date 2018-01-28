package space.entities;

import space.field.World;
import space.gui.Sprite;
import space.gui.sprites.SpriteRegistry;

import java.awt.*;
import java.awt.image.BufferedImage;

public class StraightLineEnemy extends Enemy{


    public StraightLineEnemy(World world, double x, double y) {
        super(world);
        setPosition(x, y);

    }

    public double getWidth() {
        return 50;
    }

    public double getHeight() {
        return 51;
    }


    public Sprite getSprite() {
        return SpriteRegistry.getSpriteRegistry().getSprite("Goomba");
    }

    public void update() {
        move(-1,0);

        if (getXPosition() < 0){
            world.removeEnemies(this);
        }
    }
}
