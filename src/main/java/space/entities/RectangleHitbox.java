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

    public void setXPosition(double x){
        xPosition = x;
    }

    public void setYPosition(double y){
        yPosition = y;
    }

    private Rectangle asRectangle(Hitbox hitbox) {
    	return new Rectangle((int)hitbox.getXPosition(), (int)hitbox.getYPosition(), (int)hitbox.getWidth(), (int)hitbox.getHeight());
    }

    public boolean isIntersecting(Hitbox hitbox) {
    	boolean value = asRectangle(this).intersects(asRectangle(hitbox));
    	
    	System.out.println("x: " + getXPosition());
    	System.out.println("y: " + getYPosition());
    	System.out.println("Width: " + getWidth());
    	System.out.println("Height: " + getHeight());
    	
    	if(value) {
    		System.out.println("Is intersecting");
    	}
    	
    	return value;
    	/*
        double x2 = xPosition + leWidth;
        double y2 = yPosition + leHeight;
        double x3 = hitbox.getXPosition();
        double y3 = hitbox.getYPosition();
        double x4 = x3 + hitbox.getWidth();
        double y4 = y3 + hitbox.getHeight();

        System.out.println(getYPosition());
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);

        if(x3 > x2 || y3 > y2 || xPosition > x4 || yPosition > y4) {
            return true;
        }
        else {
            return false;
        }
        */
    }
}
