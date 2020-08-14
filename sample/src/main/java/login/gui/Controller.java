package login.gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * login.gui.Controller.
 *
 * @author Maxim Vanny
 * @version 5.0
 * @since 8/14/2020
 */
public class Controller implements Initializable {
    @FXML
    private JFXTextField usr;

    @FXML
    private JFXPasswordField pass;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton signup;

    @FXML
    void makeLogin(ActionEvent event) {
        final String name = this.usr.getText();
        final String pass = this.pass.getText();
        final String log = Objects.equals("m", name)
                && Objects.equals("p", pass)
                ? "Welcome!" : "Get out!";
        System.out.println(log);

    }

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {

    }
}
