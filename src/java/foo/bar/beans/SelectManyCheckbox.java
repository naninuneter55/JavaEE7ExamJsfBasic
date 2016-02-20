package foo.bar.beans;

import foo.bar.util.FooBarUtil;
import java.util.Arrays;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class SelectManyCheckbox {

    private int[] selectManyCheckbox;

    public SelectManyCheckbox() {
    }

    public String action() {
        FooBarUtil.printClassMethod(this.getClass().getName(),
                new Throwable().getStackTrace()[0].getMethodName());
        System.out.println("Select many checkBox : " + Arrays.toString(getSelectManyCheckbox()));
        return null;
    }

    public int[] getSelectManyCheckbox() {
        return selectManyCheckbox;
    }

    public void setSelectManyCheckbox(int[] selectManyCheckbox) {
        this.selectManyCheckbox = selectManyCheckbox;
    }


}
