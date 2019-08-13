package framework;

public interface Enemy extends Cloneable {
    public abstract void show();
    public abstract Enemy createClone();
}