package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class InputSecret {

    private String inputSecret;

    public InputSecret() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Input secret : " + getInputSecret());
        return null;
    }

    public String getInputSecret() {
        return inputSecret;
    }

    public void setInputSecret(String inputSecret) {
        this.inputSecret = inputSecret;
    }

}
