package space.entities;

import space.field.World;
import space.gui.Sprite;
import space.gui.sprites.SpriteRegistry;

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
