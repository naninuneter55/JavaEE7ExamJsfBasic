package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import java.util.Arrays;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class SelectManyListbox {

    private int[] selectManyListbox;

    public SelectManyListbox() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Select many list box : " + Arrays.toString(getSelectManyListbox()));
        return null;
    }

    public int[] getSelectManyListbox() {
        return selectManyListbox;
    }

    public void setSelectManyListbox(int[] selectManyListbox) {
        this.selectManyListbox = selectManyListbox;
    }


}
