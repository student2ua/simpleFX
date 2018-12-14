package sample;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.*;
import sample.repo.LoginRepo;

public class LoginFormViewModel implements ViewModel {
    private StringProperty passStr = new ReadOnlyStringWrapper();
    private StringProperty loginStr = new SimpleStringProperty();
    private BooleanProperty loginButtonDisabled = new SimpleBooleanProperty();
    private BooleanProperty loginOk = new SimpleBooleanProperty();
    private LoginRepo loginRepo = new LoginRepo();

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

    public Boolean isLoginOk() {
        return loginOk.get();
    }

    public void setLoginOk() {
        loginOk.setValue(loginRepo.login(getLoginStr(), getPassStr()));
    }

    public BooleanProperty loginOkProperty() {
        return loginOk;
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
