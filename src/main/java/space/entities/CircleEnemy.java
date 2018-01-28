package space.entities;


import space.gui.Sprite;
import space.field.World;
import space.gui.sprites.SpriteRegistry;

import java.awt.*;
import java.awt.image.BufferedImage;

public class CircleEnemy extends Enemy {
    public CircleEnemy(World world){
        super(world);
    }


    public Sprite getSprite() {
        return SpriteRegistry.getSpriteRegistry().getSprite("Octocat");
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
    public double getHeight(){
        return 50;
    }
    public double getWidth(){
        return 50;
    }
}
