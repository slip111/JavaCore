package com.goit.gojavaonline.module6.musicshop;

import java.util.List;

public class Customer {
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
