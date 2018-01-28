package space.entities;

import space.field.World;
import space.gui.Sprite;
import space.gui.sprites.SpriteRegistry;

import java.awt.*;
import java.awt.image.BufferedImage;

public class StraightLineEnemy extends Enemy{


    public StraightLineEnemy(World world) {
        super(world);
        setPosition(world.getWidth(), world.getHeight()/2);

    }

    public double getWidth() {
        return 50;
    }

    public double getHeight() {
        return 25;
    }


    public Sprite getSprite() {
        return SpriteRegistry.getSpriteRegistry().getSprite("Enemy_1");
    }

    public void update() {
        move(-1,0);

        if (getXPosition() < 0){
            world.removeEnemies(this);
        }
    }
}
