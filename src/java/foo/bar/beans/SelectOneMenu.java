package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class SelectOneMenu {

    private int selectOneMenu;

    public SelectOneMenu() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Select one menu : " + getSelectOneMenu());
        return null;
    }

    public int getSelectOneMenu() {
        return selectOneMenu;
    }

    public void setSelectOneMenu(int selectOneMenu) {
        this.selectOneMenu = selectOneMenu;
    }


}
