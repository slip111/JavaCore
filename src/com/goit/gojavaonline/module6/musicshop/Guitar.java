package com.goit.gojavaonline.module6.musicshop;

public class Guitar extends Instruments {
    private String guitarType;// акустическая гитара, бас гитара, элестрогитара.
    private Integer guitarStorageQuantity; // количество на складе
    public Guitar(String name, String type, Integer quantity){
        instrumentName = name;
        guitarType = type;
        guitarStorageQuantity = quantity;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public Integer getGuitarStorageQuantity() {
        return guitarStorageQuantity;
    }

    public void setGuitarStorageQuantity(Integer guitarStorageQuantity) {
        this.guitarStorageQuantity = guitarStorageQuantity;
    }
}