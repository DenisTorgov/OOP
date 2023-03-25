package org.example;
public class Goods extends Category{
    protected String name;
    protected double price;
    protected double rating;
    public Goods() {
    }
    public Goods(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return this.name;}
    public double getPrice() { return this.price; }
    public void setPrice(double price) { this.price = price; }
    public double getRating() { return this.rating; }
    public void setRating(double rating) { this.rating = rating; }
}
