package com.goit.gojavaonline.module6.musicshop1;

import java.util.HashSet;
import java.util.Set;

public class Instruments {
    private String instrumentName; // Название инструмента
    private String instrumentType; // Тип инструмента - духовой, клавишный, щипковый

    private Set orderitem = new HashSet();

    public void setOrderitem (OrderItem o) {
        orderitem.add(o);
    }

    public Set getOrderitem() {
        return orderitem;
    }

    public void deleteOrderitem (OrderItem o) {
        orderitem.remove(o);
    }

    public void setOrderitem(Set orderitem) {
        this.orderitem = orderitem;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
}
