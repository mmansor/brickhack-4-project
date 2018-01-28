package space.entities;

import space.field.World;
import space.gui.Sprite;

public class StandardPlayerBullet extends Bullet{

    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private Hitbox hitbox;
    private boolean isPlayer;

    public StandardPlayerBullet(World world, double x, double y) {
        super(world);
        xPosition = x;
        yPosition = y;
        width = 10;
        height = 5;
        hitbox = new RectangleHitbox(xPosition, yPosition, width, height);
        isPlayer = true;
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

    public Sprite getSprite() {
        return null;
    }

    public void update() {
        xPosition += 2;
    }
}
