package com.goit.gojavaonline.module6.musicshop;

import java.util.List;

public class Instruments {
    protected String instrument;
    List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
