package foo.bar;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "form")
@RequestScoped
public class Form {

    private String secret;
    private String text;
    private String textArea;
    private boolean checkBox;
    private int[] manyCheckBox;
    private int oneRadio;
    private Map<String, Integer> oneRadioItems;
    private int oneListBox;
    private Map<String, Integer> oneListBoxItems;
    private Integer[] manyListBox;
    private int oneMenu;
    private Integer[] manyMenu;

    public Form() {
        oneRadioItems = new LinkedHashMap<>();
        oneRadioItems.put("ラジオボタン１", 0);
        oneRadioItems.put("ラジオボタン２", 1);
        oneRadioItems.put("ラジオボタン３", 2);
        oneListBoxItems = new LinkedHashMap<>();
        oneListBoxItems.put("１項目のみ選択可能なリストボックス１", 0);
        oneListBoxItems.put("１項目のみ選択可能なリストボックス２", 1);
        oneListBoxItems.put("１項目のみ選択可能なリストボックス３", 2);
        oneListBoxItems.put("１項目のみ選択可能なリストボックス４", 3);
        oneListBoxItems.put("１項目のみ選択可能なリストボックス５", 4);
    }

    public String actionCommandButton() {
        System.out.println("actionCommandButton()");
        return null;
    }

    public String actionInputSecret() {
        System.out.println("Input secret : " + getSecret());
        return null;
    }

    public String actionInputText() {
        System.out.println("Input text : " + getText());
        return null;
    }

    public String actionInputTextArea() {
        System.out.println("Input textArea : " + getTextArea());
        return null;
    }

    public String actionSelectCheckBox() {
        System.out.println("Input checkBox : " + isCheckBox());
        return null;
    }

    public String actionSelectManyCheckBox() {
        System.out.println("Select many checkBox : " + Arrays.toString(getManyCheckBox()));
        return null;
    }

    public String actionSelectOneRadio() {
        System.out.println("Select one radio : " + getOneRadio());
        return null;
    }

    public String actionSelectOneListBox() {
        System.out.println("Select one list box : " + getOneListBox());
        return null;
    }

    public String actionSelectManyListBox() {
        System.out.println("Select many list box : " + Arrays.toString(getManyListBox()));
        return null;
    }

    public String actionSelectOneMenu() {
        System.out.println("Select one menu : " + getOneMenu());
        return null;
    }

    public String actionSelectManyMenu() {
        System.out.println("Select many menu : " + Arrays.toString(getManyMenu()));
        return null;
    }
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    public boolean isCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }

    public int[] getManyCheckBox() {
        return manyCheckBox;
    }

    public void setManyCheckBox(int[] manyCheckBox) {
        this.manyCheckBox = manyCheckBox;
    }

    public int getOneRadio() {
        return oneRadio;
    }

    public void setOneRadio(int oneRadio) {
        this.oneRadio = oneRadio;
    }

    public Map<String, Integer> getOneRadioItems() {
        return oneRadioItems;
    }

    public int getOneListBox() {
        return oneListBox;
    }

    public void setOneListBox(int oneListBox) {
        this.oneListBox = oneListBox;
    }

    public Map<String, Integer> getOneListBoxItems() {
        return oneListBoxItems;
    }

    public void setOneListBoxItems(Map<String, Integer> oneListBoxItems) {
        this.oneListBoxItems = oneListBoxItems;
    }
    
    public Integer[] getManyListBox() {
        return manyListBox;
    }

    public void setManyListBox(Integer[] manyListBox) {
        this.manyListBox = manyListBox;
    }

    public int getOneMenu() {
        return oneMenu;
    }

    public void setOneMenu(int oneMenu) {
        this.oneMenu = oneMenu;
    }

    public Integer[] getManyMenu() {
        return manyMenu;
    }

    public void setManyMenu(Integer[] manyMenu) {
        this.manyMenu = manyMenu;
    }


}
