package observer;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ConcreteSubjectController {

    @FXML
    private TextField AA;

    @FXML
    private TextField BB;

    private Subject cs;

    public void setModel(Subject cs) { this.cs = cs; }

    public void applyChange() {
        System.out.println("applying change...");
        cs.setState(Integer.parseInt(AA.getText()), Integer.parseInt(BB.getText()));
    }

}
