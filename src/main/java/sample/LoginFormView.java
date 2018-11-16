package sample;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormView implements FxmlView<LoginFormViewModel>, Initializable {
    @FXML
    Button loginBtn;
    @FXML
    TextField loginField;
    @FXML
    PasswordField passField;
    @InjectViewModel
    private LoginFormViewModel viewModel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginField.textProperty().bindBidirectional(viewModel.loginStringProperty());
        passField.textProperty().bindBidirectional(viewModel.passStringProperty());
        loginBtn.disableProperty().bindBidirectional(viewModel.loginButtonDisabledProperty());
    }

    @FXML
    private Text actionTarget;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actionTarget.setText(" sign " + loginField.getText() + " " + passField.getText());

    }
}
