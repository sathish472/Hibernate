package com.sfm.entity;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private  int isbnNo;
    private String title;
    private String author;
    private String pubDate;
    private String PublisherName;
    private double price;

    public int getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(int isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String publisherName) {
        PublisherName = publisherName;
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
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getIsbnNo() == book.getIsbnNo() && Double.compare(getPrice(), book.getPrice()) == 0 && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPubDate(), book.getPubDate()) && Objects.equals(getPublisherName(), book.getPublisherName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbnNo(), getTitle(), getAuthor(), getPubDate(), getPublisherName(), getPrice());
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNo=" + isbnNo +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", PublisherName='" + PublisherName + '\'' +
                ", price=" + price +
                '}';
    }
}
