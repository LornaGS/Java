package com.qa;

public class Books {

 private String name;
 private String author;
 private String price;

    //default constructor
    public Books(){}

    //constructor
    public Books(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books: " +
                "name: " + name  +
                ", author: " + author  +
                ", price:" + price
                ;
    }
}
