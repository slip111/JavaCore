package com.goit.gojavaonline.module6.musicshop;

public class Piano extends Instruments {
    private String pianoType;// пианино, фртепиано, снтезатор.
    private Integer pianoStorageQuantity; // количество на складе.
    public Piano(String name, String type,Integer quantity){
        instrumentName = name;
        pianoType = type;
        pianoStorageQuantity = quantity;
    }

    public String getPianoType() {
        return pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public Integer getPianoStorageQuantity() {
        return pianoStorageQuantity;
    }

    public void setPianoStorageQuantity(Integer pianoStorageQuantity) {
        this.pianoStorageQuantity = pianoStorageQuantity;
    }
}
