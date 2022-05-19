package com.example.task6_restcontrollers;

import java.util.Date;

public class Info {
    private Date date;
    private static int id = 0;

    public Info() {
    }

    public Info(Date date, int id) {
        this.date = date;
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id++;
    }
}
