package observer;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MultiplicationController {

    @FXML
    private Label label;

    private Multiplication mult;

    public void setModel(Multiplication mult) {
        this.mult = mult;
//        label.textProperty().bind(new SimpleIntegerProperty(mult.result).asString());
        label.textProperty().bind(Bindings.convert(mult.valueProperty()));
    }

}
