package com.goit.gojavaonline.module6.musicshop1;

public class MainMusicShop {

    public static void main(String[] args) {
        Instruments piano1 = new Instruments();
        piano1.setInstrumentName("Фортепиано");
        piano1.setInstrumentType("Клавишный");

        Instruments guitar1 = new Instruments();
        guitar1.setInstrumentName("Электрогитара");
        guitar1.setInstrumentType("Струнный");

        System.out.println("Hello World!");
        System.out.println(guitar1.getInstrumentName() +" " + guitar1.getInstrumentType());
        System.out.println(piano1.getInstrumentName() +" " + piano1.getInstrumentType());

    }
}
