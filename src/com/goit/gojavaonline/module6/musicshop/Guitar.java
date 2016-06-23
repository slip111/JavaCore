package com.goit.gojavaonline.module6.musicshop;

public class Guitar extends Instruments {
    private String guitarType;
    private int stringCount;

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }
}
