package com.fh.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int productNo;
    private String productName;
    private String discription;
    private String manufacturerName;
    private String categoryName;
    private double price;

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductNo() == product.getProductNo() && Double.compare(getPrice(), product.getPrice()) == 0 && Objects.equals(getProductName(), product.getProductName()) && Objects.equals(getDiscription(), product.getDiscription()) && Objects.equals(getManufacturerName(), product.getManufacturerName()) && Objects.equals(getCategoryName(), product.getCategoryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductNo(), getProductName(), getDiscription(), getManufacturerName(), getCategoryName(), getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNo=" + productNo +
                ", productName='" + productName + '\'' +
                ", discription='" + discription + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                '}';
    }
}
