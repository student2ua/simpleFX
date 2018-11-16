package sample;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HelloWorldViewModel implements ViewModel {
    private StringProperty helloMsg = new SimpleStringProperty("Hello Kitty");

    public StringProperty helloMsgProperty() {
        return helloMsg;
    }

    public String getHelloMsg() {
        return helloMsg.get();
    }

    public void setHelloMsg(String helloMsg) {
        this.helloMsg.set(helloMsg);
    }
}
