package com.goit.gojavaonline.module6.musicshop1;

public class OrderItem {
    private String orederitemArticle; // Артикул товара
    private String orederitemManufacturer; // Изготовитель инструмента
    private int orderitemWarranty; // Гарантийный срок товара
    private int orderitemStorageQuantity; // Количество товара на складе
    private double orderitemPrice; // Цена товара
    private int orderitemManufacturingDay; // День изготовления инструмента
    private int orderitemManufacturingMonth; // Месяц изготовления инструмента
    private int orderitemManufacturingYear; // Год изготовления инструмента
    private String art;
    private String m;
    private int w;
    private double p;
    private int q;


    public void getManufacturingDate(int d, int m, int y) {
        orderitemManufacturingDay = d;
        orderitemManufacturingMonth = m;
        orderitemManufacturingYear = y;
    }

    public void orderitem (String article, String manufacturer, int wattanty, double price, int storageQuantity ) {
        art = article;
        m = manufacturer;
        w = wattanty;
        p = price;
        q = storageQuantity;

    }

    public String getOrederitemArticle() {
        return orederitemArticle;
    }

    public void setOrederitemArticle(String orederitemArticle) {
        this.orederitemArticle = orederitemArticle;
    }

    public int getOrderitemWarranty() {
        return orderitemWarranty;
    }

    public void setOrderitemWarranty(int orderitemWarranty) {
        this.orderitemWarranty = orderitemWarranty;
    }

    public int getOrderitemStorageQuantity() {
        return orderitemStorageQuantity;
    }

    public void setOrderitemStorageQuantity(int orderitemStorageQuantity) {
        this.orderitemStorageQuantity = orderitemStorageQuantity;
    }

    public double getOrderitemPrice() {
        return orderitemPrice;
    }

    public void setOrderitemPrice(double orderitemPrice) {
        this.orderitemPrice = orderitemPrice;
    }

    public int getOrderitemManufacturingDay() {
        return orderitemManufacturingDay;
    }

    public void setOrderitemManufacturingDay(int orderitemManufacturingDay) {
        this.orderitemManufacturingDay = orderitemManufacturingDay;
    }

    public int getOrderitemManufacturingMonth() {
        return orderitemManufacturingMonth;
    }

    public void setOrderitemManufacturingMonth(int orderitemManufacturingMonth) {
        this.orderitemManufacturingMonth = orderitemManufacturingMonth;
    }

    public int getOrderitemManufacturingYear() {
        return orderitemManufacturingYear;
    }

    public void setOrderitemManufacturingYear(int orderitemManufacturingYear) {
        this.orderitemManufacturingYear = orderitemManufacturingYear;
    }



    public String getOrederitemManufacturer() {
        return orederitemManufacturer;
    }

    public void setOrederitemManufacturer(String orederitemManufacturer) {
        this.orederitemManufacturer = orederitemManufacturer;
    }
}
