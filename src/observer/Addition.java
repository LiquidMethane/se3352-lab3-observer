package observer;

public class Addition extends Operation{

    public Addition(Subject s) {
        super();
        _subject = s;
        _subject.register(this);
    }

    @Override
    public void update() {
        int arr[] = _subject.getState();
        setResult(arr[0] + arr[1]);
        System.out.println("Addition: " + getResult());

    }
}
