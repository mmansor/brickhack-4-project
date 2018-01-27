package space.entities;

import java.awt.*;

public class RectangleHitbox implements Hitbox {

    private double xPosition;
    private double yPosition;
    private double leWidth;
    private double leHeight;

    public RectangleHitbox(double x, double y, double width, double height) {
        xPosition = x;
        yPosition = y;
        leWidth = width;
        leHeight = height;
    }


    public double getXPosition() {
        return xPosition;
    }

    public double getYPosition() {
        return yPosition;
    }

    public double getWidth() {
        return leWidth;
    }

    public double getHeight() {
        return leHeight;
    }


    public boolean isIntersecting(Hitbox hitbox) {
        double thisNewX = xPosition + getWidth();
        double thisNewY = yPosition + getHeight();
        double otherNewX = hitbox.getXPosition() + hitbox.getWidth();
        double otherNewY = hitbox.getYPosition() + hitbox.getHeight();

        if(hitbox.getXPosition() > thisNewX || otherNewY > yPosition || xPosition > otherNewX || thisNewY > hitbox.getYPosition()) {
            return true;
        }
        else {
            return false;
        }
    }
}
