package com.she.entity;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    private int addressNo;
    private String addressLine1;
    private String addressLine2;

    private String city;
    private String state;

    private String country;

    public int getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(int addressNo) {
        this.addressNo = addressNo;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return getAddressNo() == address.getAddressNo() && Objects.equals(getAddressLine1(), address.getAddressLine1()) && Objects.equals(getAddressLine2(), address.getAddressLine2()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getState(), address.getState()) && Objects.equals(getCountry(), address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressNo(), getAddressLine1(), getAddressLine2(), getCity(), getState(), getCountry());
    }

    @Override
    public String toString() {
        return "Address{" + "addressNo=" + addressNo + ", addressLine1='" + addressLine1 + '\'' + ", addressLine2='" + addressLine2 + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", country='" + country + '\'' + '}';
    }
}
