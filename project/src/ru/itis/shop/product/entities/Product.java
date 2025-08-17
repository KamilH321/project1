package ru.itis.shop.product.entities;

public class Product {
    Integer id;
    String name;
    String description;
    Integer price;
    String categoty;

    public Product(Integer id, String name, String description, Integer price, String categoty) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoty = categoty;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCategoty() {
        return categoty;
    }
}
