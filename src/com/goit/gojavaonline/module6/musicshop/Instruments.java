package com.goit.gojavaonline.module6.musicshop;

import java.util.List;

public class Instruments {
    private String instrumentName; //труба, пианино, гитара
    private List<OrderItem> orderItems;

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
