package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class CommandButton {

    public CommandButton() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        return null;
    }
}
