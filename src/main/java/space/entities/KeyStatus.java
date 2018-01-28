package space.entities;

public interface KeyStatus {
    public abstract boolean shouldMoveUp();
    public abstract boolean shouldMoveDown();
    public abstract boolean shouldMoveLeft();
    public abstract boolean shouldMoveRight();
    public abstract boolean shouldShoot();
}
