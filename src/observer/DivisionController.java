package observer;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DivisionController {

    @FXML
    private Label label;

    private Division div;

    public void setModel(Division div) {
        this.div = div;
//        label.textProperty().bind(new SimpleIntegerProperty(div.result).asString());
        label.textProperty().bind(Bindings.convert(div.valueProperty()));
    }

}
