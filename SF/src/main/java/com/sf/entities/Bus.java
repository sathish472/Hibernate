package com.sf.entities;

import java.io.Serializable;
import java.util.Objects;

public class Bus implements Serializable {

    private int busNo;
    private String regNo;
    private String maker;

    private int capacity;
    private int price;

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        return getBusNo() == bus.getBusNo() && getCapacity() == bus.getCapacity() && getPrice() == bus.getPrice() && Objects.equals(getRegNo(), bus.getRegNo()) && Objects.equals(getMaker(), bus.getMaker());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusNo(), getRegNo(), getMaker(), getCapacity(), getPrice());
    }

    @Override
    public String toString() {
        return "Bus{" + "busNo=" + busNo + ", RegNo='" + regNo + '\'' + ", maker='" + maker + '\'' + ", capacity=" + capacity + ", price=" + price + '}';
    }
}
