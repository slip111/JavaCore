package com.goit.gojavaonline.module6.musicshop;

public class Horn extends Instruments {
    private String hornType;// труба, саксофон, тробмбон.
    private Integer hornStorageQuantity; //количество на складе
    public Horn(String name, String type, Integer quantity){
        instrumentName = name;
        hornType = type;
        hornStorageQuantity = quantity;
    }

    public String getHornType() {
        return hornType;
    }

    public void setHornType(String hornType) {
        this.hornType = hornType;
    }

    public Integer getHornStorageQuantity() {
        return hornStorageQuantity;
    }

    public void setHornStorageQuantity(Integer hornStorageQuantity) {
        this.hornStorageQuantity = hornStorageQuantity;
    }
}
