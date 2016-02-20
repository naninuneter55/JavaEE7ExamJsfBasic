package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class InputTextArea {

    private String inputTextArea;

    public InputTextArea() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Input textArea : " + getInputTextArea());
        return null;
    }

    public String getInputTextArea() {
        return inputTextArea;
    }

    public void setInputTextArea(String inputTextArea) {
        this.inputTextArea = inputTextArea;
    }


}
