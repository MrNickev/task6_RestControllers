package com.example.task6_restcontrollers;

public class DataEntity {
    private float price;
    private Info info;

    public DataEntity() {
    }

    public DataEntity(float price, Info info) {
        this.price = price;
        this.info = info;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
