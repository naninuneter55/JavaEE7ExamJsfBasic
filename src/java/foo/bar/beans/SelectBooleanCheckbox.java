package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class SelectBooleanCheckbox {

    private boolean selectBooleanCheckbox;

    public SelectBooleanCheckbox() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Input checkBox : " + isSelectBooleanCheckbox());
        return null;
    }

    public boolean isSelectBooleanCheckbox() {
        return selectBooleanCheckbox;
    }

    public void setSelectBooleanCheckbox(boolean selectBooleanCheckbox) {
        this.selectBooleanCheckbox = selectBooleanCheckbox;
    }


}
