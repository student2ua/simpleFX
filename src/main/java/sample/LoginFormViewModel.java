package sample;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.*;

public class LoginFormViewModel implements ViewModel {
    private StringProperty passStr = new ReadOnlyStringWrapper();
    private StringProperty loginStr = new SimpleStringProperty();
    private BooleanProperty loginButtonDisabled = new SimpleBooleanProperty();

    public LoginFormViewModel() {
        loginButtonDisabled.bind(loginStr.isEmpty().or(passStr.isEmpty()));
    }

    public StringProperty passStringProperty() {
        return passStr;
    }

    public StringProperty loginStringProperty() {
        return loginStr;
    }

    public boolean isLoginButtonDisabled() {
        return loginButtonDisabled.get();
    }

    public BooleanProperty loginButtonDisabledProperty() {
        return loginButtonDisabled;
    }

    public String getLoginStr() {
        return loginStr.get();
    }

    public void setLoginStr(String loginStr) {
        this.loginStr.set(loginStr);
    }

    public String getPassStr() {
        return passStr.get();
    }

    public void setPassStr(String passStr) {
        this.passStr.set(passStr);
    }


}
