package com.j4boot.aws.lambda.coffee.model;

public class Coffee {

    private final long id;
    private final String name;
    private final double price;

    public Coffee(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }
}