package com.goit.gojavaonline.module6.musicshop1;

public class Guitar extends Instruments {
    String guitarType; // Тип гитары - акустическая, электро
    String guitarGenre; // Жанр для которого предназначена гитара
    int guitarStringCount; // Количество струн гитары

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public String getGuitarGenre() {
        return guitarGenre;
    }

    public void setGuitarGenre(String guitarGenre) {
        this.guitarGenre = guitarGenre;
    }

    public int getGuitarStringCount() {
        return guitarStringCount;
    }

    public void setGuitarStringCount(int guitarStringCount) {
        this.guitarStringCount = guitarStringCount;
    }
}
