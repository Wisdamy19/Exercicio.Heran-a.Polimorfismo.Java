package Exercicio;

import java.lang.String;

public class Product {
    private String name;
    private Double price;

    public Product(){
        super();
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag(){
        return String.format(getName() + " $ " + getPrice());
    }
}
