package space.entities;

public interface Hitbox {

	public abstract double getXPosition();
	public abstract double getYPosition();
	public abstract double getWidth();
	public abstract double getHeight();

	public abstract void setXPosition(double x);
	public abstract void setYPosition(double y);
	
	public abstract boolean isIntersecting(Hitbox hitbox);
}
