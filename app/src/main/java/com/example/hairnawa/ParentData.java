package com.example.hairnawa;

import java.util.Vector;

public class ParentData {

    private String name;
    private String date;
    private String service;

    public Vector<ChildData> child;

    public ParentData(String name, String date, String service, String phoneNumber) {
        this.name= name;
        this.date = date;
        this.service= service;
        child = new Vector<>();
        child.add(new com.example.hairnawa.ChildData(phoneNumber));
    }

    String getName() {
        return this.name;
    }

    String getDate() {
        return this.date;
    }

    String getService() {
        return this.service;
    }
}
