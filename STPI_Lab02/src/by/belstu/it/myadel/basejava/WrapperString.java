package by.belstu.it.myadel.basejava;

/*
@author PyroGodz
@version 1
 */

public class WrapperString {
    private String str1;

    @Override
    public String toString() {
        return "WrapperString{"+ "str1 = "+ str1 +"}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public WrapperString(String str1) {
        this.str1 = str1;
    }

    public void replace(char oldChar, char newChar){
        str1.replace(oldChar, newChar);
    }
}
