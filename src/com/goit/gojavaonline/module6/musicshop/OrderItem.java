package com.goit.gojavaonline.module6.musicshop;

public class OrderItem {
    private String orderItemArticle;
    private int orderItemStorageQuantity;

    public int getOrderItemStorageQuantity() {
        return orderItemStorageQuantity;
    }

    public void setOrderItemStorageQuantity(int orderItemStorageQuantity) {
        this.orderItemStorageQuantity = orderItemStorageQuantity;
    }

    public String getOrderItemArticle() {
        return orderItemArticle;
    }

    public void setOrderItemArticle(String orderItemArticle) {
        this.orderItemArticle = orderItemArticle;
    }
}
