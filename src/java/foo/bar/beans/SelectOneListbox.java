package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class SelectOneListbox {

    private int selectOneListbox;

    public SelectOneListbox() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Select one list box : " + getSelectOneListbox());
        return null;
    }

    public int getSelectOneListbox() {
        return selectOneListbox;
    }

    public void setSelectOneListbox(int selectOneListbox) {
        this.selectOneListbox = selectOneListbox;
    }

}
