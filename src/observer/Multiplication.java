package observer;

public class Multiplication extends Operation{

    public Multiplication(Subject s) {
        super();
        _subject = s;
        _subject.register(this);
    }

    @Override
    public void update() {
        int arr[] = _subject.getState();
        setResult(arr[0] * arr[1]);

        System.out.println("Multiplication: " + getResult());
    }
}
