package observer;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdditionController {

    @FXML
    private Label label;

    private Addition add;

    public void setModel(Addition add) {
        this.add = add;
//        label.textProperty().bind(new SimpleIntegerProperty(add.result).asString());
        label.textProperty().bind(Bindings.convert(add.valueProperty()));
    }

}
