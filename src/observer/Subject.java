package observer;

public abstract class Subject {
    abstract void register(Operation op);
    abstract void Notify();
    abstract void setState(int a, int b);
    abstract int[] getState();
}
