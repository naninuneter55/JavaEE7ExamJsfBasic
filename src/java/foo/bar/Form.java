package foo.bar;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "book")
@RequestScoped
public class Form {

    public Form() {
    }

    public String actionCommandButton() {
        System.out.println("actionCommandButton()");
        return null;
    }
}
