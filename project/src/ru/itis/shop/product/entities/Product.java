package ru.itis.shop.product.entities;

public class Product {
    Integer id;
    String name;
    Integer price;
    String type;

    public Product(Integer id, String name, String description, Integer price, String categoty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = categoty;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCategoty() {
        return type;
    }
}
