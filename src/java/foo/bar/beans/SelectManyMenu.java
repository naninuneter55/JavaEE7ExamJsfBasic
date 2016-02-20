package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import java.util.Arrays;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class SelectManyMenu {

    private int[] selectManyMenu;

    public SelectManyMenu() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Select many menu : " + Arrays.toString(getSelectManyMenu()));
        return null;
    }

    public int[] getSelectManyMenu() {
        return selectManyMenu;
    }

    public void setSelectManyMenu(int[] selectManyMenu) {
        this.selectManyMenu = selectManyMenu;
    }

}
