package com.example.demo;

public class Book {

    public Book(String name, String author, String publishingHouse, double price) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.price = price;
    }

    private String name;
    private String author;
    private String publishingHouse;

    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", price=" + price +
                '}';
    }
}
