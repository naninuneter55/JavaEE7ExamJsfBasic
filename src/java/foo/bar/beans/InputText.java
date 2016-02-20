package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class InputText {

    private String inputText;

    public InputText() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Input text : " + getInputText());
        return null;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }


}
