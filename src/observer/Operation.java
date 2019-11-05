package observer;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public abstract class Operation {

    protected Subject _subject;

    protected final IntegerProperty value;

    public Operation() {
        this.value = new SimpleIntegerProperty(0);
    }

    public void setResult(int result) { this.value.set(result); }
    public IntegerProperty valueProperty() { return value; }
    public int getResult() { return value.get(); }



    public abstract void update();
}
