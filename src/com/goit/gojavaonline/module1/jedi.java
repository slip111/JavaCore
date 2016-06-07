package com.goit.gojavaonline.module1;

public class jedi {
    private String userName;
    private int childrenNumber;
    private boolean isOnDarkSide;

    jedi(String name, int childrenNumber, boolean isOnDarkSide){
        this.userName = name;
        this.childrenNumber = childrenNumber;
        this.isOnDarkSide = isOnDarkSide;
    }
    public String getUserName(){
        return this.userName;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public boolean getisOnDarkSide() {
        return isOnDarkSide;
    }
}

