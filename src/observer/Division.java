package observer;

public class Division extends Operation{

    public Division(Subject s) {
        super();
        _subject = s;
        _subject.register(this);
    }

    @Override
    public void update() {
        int arr[] = _subject.getState();

        try {
            setResult(arr[0] / arr[1]);
        } catch (ArithmeticException e){
            setResult(-1);
        }

        System.out.println("Division: " + getResult());
    }
}
