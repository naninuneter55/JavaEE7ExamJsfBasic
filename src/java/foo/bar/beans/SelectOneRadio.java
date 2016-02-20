package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class SelectOneRadio {

    private int selectOneRadio;

    public SelectOneRadio() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Select one radio : " + getSelectOneRadio());
        return null;
    }

    public int getSelectOneRadio() {
        return selectOneRadio;
    }

    public void setSelectOneRadio(int selectOneRadio) {
        this.selectOneRadio = selectOneRadio;
    }

}
