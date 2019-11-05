package observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject extends Subject{

    private List<Operation> _observers;
    private int a, b;

    public ConcreteSubject() {
        super();
        this.a = 0;
        this.b = 0;
        _observers = new LinkedList<>();
    }

    @Override
    public void register(Operation op) {
        _observers.add(op);
    }

    @Override
    public void Notify() {
        for (Operation op: _observers) {
            op.update();
        }
    }

    @Override
    void setState(int a, int b) {
        this.a = a;
        this.b = b;
        Notify();
    }

    @Override
    int[] getState() {
        return new int[]{this.a, this.b};
    }
}
